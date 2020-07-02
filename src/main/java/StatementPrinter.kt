import java.text.NumberFormat
import java.util.*

class StatementPrinter {
    fun print(invoice: Invoice, plays: Map<String, Play>): String {
        var totalAmount = 0
        var volumeCredits = 0
        var result = String.format("Statement for %s\n", invoice.customer)
        val frmt = NumberFormat.getCurrencyInstance(Locale.US)
        for ((playID, audience) in invoice.performances) {
            val play = plays[playID]
            var thisAmount = 0
            when (play!!.type) {
                "tragedy" -> {
                    thisAmount = 40000
                    if (audience > 30) {
                        thisAmount += 1000 * (audience - 30)
                    }
                }
                "comedy" -> {
                    thisAmount = 30000
                    if (audience > 20) {
                        thisAmount += 10000 + 500 * (audience - 20)
                    }
                    thisAmount += 300 * audience
                }
                else -> throw Error("unknown type: \${play.type}")
            }

            // add volume credits
            volumeCredits += Math.max(audience - 30, 0)
            // add extra credit for every ten comedy attendees
            if ("comedy" == play.type) volumeCredits += Math.floor(audience / 5.toDouble()).toInt()

            // print line for this order
            result += String.format("  %s: %s (%s seats)\n", play.name, frmt.format(thisAmount / 100.toLong()), audience)
            totalAmount += thisAmount
        }
        result += String.format("Amount owed is %s\n", frmt.format(totalAmount / 100.toLong()))
        result += String.format("You earned %s credits\n", volumeCredits)
        return result
    }
}
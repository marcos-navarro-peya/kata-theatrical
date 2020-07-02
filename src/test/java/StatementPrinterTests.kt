import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StatementPrinterTests {
    @Test
    fun exampleStatement() {
        val plays = mapOf(
                Pair("hamlet", Play("Hamlet", "tragedy")),
                Pair("as-like", Play("As You Like It", "comedy")),
                Pair("othello", Play("Othello", "tragedy")))
        val invoice = Invoice("BigCo", listOf(
                Performance("hamlet", 55),
                Performance("as-like", 35),
                Performance("othello", 40)))
        val statementPrinter = StatementPrinter()
        val result = statementPrinter.print(invoice, plays)
        Assertions.assertEquals("", result)
    }
}
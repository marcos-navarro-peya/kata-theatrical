# Theatrical Players Refactoring Kata

Image a company of theatrical players who go out to various events performing
plays. Typically, a customer will request a few plays and the company charges
them based on the size of the audience and the kind of play they perform. There
are currently two kinds of plays that the company performs: tragedies and
comedies. As well as providing a bill for the performance, the company gives its
customers “volume credits” which they can use for discounts on future performances—think of it as a customer loyalty mechanism.

## What you need to change

### 1st iteration

The players are looking to perform more kinds of plays: they hope to add history, pastoral, pastoral-comical, historical-pastoral, tragical-historical,
tragical-comical-historical-pastoral, scene individable, and poem unlimited to their repertoire.
They haven’t exactly decided yet what they want to do and when. 
This change will affect both the way their plays are charged for and the way volume credits are calculated.
As an experienced developer I can be sure that whatever scheme they come up with, they will change it again within six months 

### 2nd Iteration

The company is concerned about enviromental impact of their business and decided to implement an integration with a new service
that provide digital invoice for their customers. To connect to that service we need to create a Invoice

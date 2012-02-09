Dispecto is an academic example for crosscutting concerns.
Crosscutting concerns are concerns crosscutting the dominant software decomposition and 
subject of Aspect-oriented programming (AOP).

Dispecto currently contains 5 crosscutting concerns:
–  The  two  state-pattern  implementations  contribute  to  the  Party-Context-
Concern. According to the party attached to a disco, the behaviour of the
Disco-instance as well as all the Guest-instances visiting it has to change.
This clearly crosscutts the decomposition and simulates behaviour that could
be described well with Context-oriented Programming.
–  Several actions like drinking and dancing, as well as the visited discos, are
logged to stdout. Logging is an typical example for crosscutting behaviour.
–  Guests only enter discotheques which are not baneful for their reputation.
Thus the reputation-concern  is superimposed upon Disco and Guest. It is
an example for behaviour that could be described well with Role-based Pro-
gramming.
–  The creation and destruction of every Guest- and Disco-instance has to be
authorized by the Authority-class. Thus for the authorization-concern every
constructor and destructor has to obtain the Singleton-instance of Authority
and call the report-method.
–  Upon the entry and the exit discotheques need to persist the condition of
their guests. This healthiness-concern is not modularized in the current im-
plementation, thus it crosscutts the system, too.
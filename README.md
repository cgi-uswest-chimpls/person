# person

Person microservice for CW Portal.  Simulates person records replicated from eWiSACWIS.  Person records may refer to children in placement, case participants like biological parents, or provider participants like foster parents and children living in the home.

## Person object

String idprsn;
String nmfrst;
String nmlst;
Timestamp dtbrth;
BigDecimal qtage;
String tximagelink;

## endpoints

/people/{idprsn} - Returns one Person by idprsn key.

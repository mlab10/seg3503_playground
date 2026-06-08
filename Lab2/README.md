# Lab 2
## Exercice 1
---
Exécutez la commande suivante dans Bash: 
> java --add-opens java.base/java.lang=ALL-UNNAMED -jar user-registration-app-0.1.0.jar

ou
> bin/run

Ensuite, visiter http://localhost:8080/

| Cas de test | Résultats Escomptés | Résultats Actuels | Verdict (Succès, Échec, Non-concluant)| 
| --- | ----------- | --- | --- |
| 1 | Accepté | ![alt text](SEG3503Lab2Exercice1TestCase1.jpg)![alt text](SEG3503Lab2Exercice1TestCase1Sucess.jpg) | Succès|
| 2 | Accepté |![alt text](SEG3503Lab2Exercice1TestCase2.jpg)![alt text](SEG3503Lab2Exercice1TestCase2Sucess.jpg) | Succès|
| 3 |  Accepté |![alt text](SEG3503Lab2Exercice1TestCase3.jpg)![alt text](SEG3503Lab2Exercice1TestCase3Sucess.jpg) | Succès|
| 4 | Wrong postal code format | Wrong postal code format and age is mandatory ![alt text](SEG3503Lab2Exercice1TestCase4.jpg)| Échec|
| 5 | Wrong postal code format | ![alt text](SEG3503Lab2Exercice1TestCase5.jpg) | Succès|
| 6 | Age is mandatory | ![alt text](SEG3503Lab2Exercice1TestCase6.jpg) | Succès|
| 7 | Size of user name error | ![Image of test case 8 wrong Username format error](SEG3503Lab2Exercice1TestCase7.jpg) | Succès|
| 8 | Wrong user name format error | ![Image of test case 8 wrong Username format error](SEG3503Lab2Exercice1TestCase8.jpg) | Succès|

## JUnit Parameterized Runner
---
résultats obtenus lors de l'exécution du test

![alt text](SEG3503Lab2Exercice2OutputRunningTest1.jpg)
![alt text](SEG3503Lab2Exercice2OutputRunningTest2.jpg)
![alt text](SEG3503Lab2Exercice2OutputRunningTest3.jpg)

## Exercice 2
---
Test run using bin/test:

![alt text](SEG3503Lab2Exercice2BinTest.jpg)

Typical explicit test case that doesn't use exceptions:

![alt text](SEG3503Lab2Exercice2ExplicitTestCaseNoException.jpg)

Explicit test cases that have exceptions:

![alt text](SEG3503Lab2Exercice2ExplicitTestCaseWithException.jpg)

Parameterized test values for test cases that run OK and have a return date:

![alt text](SEG3503Lab2Exercice2ParameterizedTestCasesDateOK.jpg)

Parameterized test values for test cases that DO result in an exception:

![alt text](SEG3503Lab2Exercice2ParameterizedTestCasesDateException.jpg)
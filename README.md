# SIACargo Flight Schedule & Tracking assignment

I made 2 folder non Test Suite and Task assignment

## Task Assignment

This file is according to document file sent by email as is. To run the test, go to Test Suites -> Task Assignment and run the Test Suite. Do not run from Test Case because I did not put openbrowser line in there.

In Test Suite "Task Assignment", I made setup for Tests in Scripts and also I bind Test Data in Test "02 - Search on Flight Schedule (in Hover menu E-SERVICES)"

Test Data consist of :
1. ‘SIN' in ORIGIN, ‘SYD’ in DESTINATION, select DEPARTURE DATE as ’21 JUL 2023’, find flight ‘SQ0221’
2. ‘SIN' in ORIGIN, ‘SYD’ in DESTINATION, everything else is blanked out (You may check at Data Files -> Flight Schedule Data)

For Navigate to Browser, Hover to E-SERVICES, Search on Flight Schedule I made it in keyword

CustomKeywords.'siacargo.siacargokeyword.urlNavigation'() -> Navigate to URL SIACargo

CustomKeywords.'siacargo.siacargokeyword.hoverEService'() -> Hover menu E-SERVICES

CustomKeywords.'siacargo.siacargokeyword.clickTrackingPage'() -> Click menu Tracking after Hover menu E-SERVICES

CustomKeywords.'siacargo.siacargokeyword.clickFlightSchedulePage'() -> Click menu Flight Schedule after Hover menu E-SERVICES

## Non Test Suite

This is the base code for Task Assignment, you may run this per test cases
/*Test - 1 :  17th APR'2022

Branch Name : MaulikK_Test_1
Commit : "Test-1, programming test"

WAP that print output as below
On user defined range (1-100), 
if number is div by 3, print 6 is div by 3
if number is div by 5, print 10 is div by 5
if number is div by 3&5, print 15 is div by 3 & 5
------------------------------
output : 
3 is div by 3
5 is div by 5
6 is div by 3
9 is div by 3
10 is div by 5
12 is div by 3
15 is div by 3 & 5
18 is div by 3
20 is div by 5
.
.
.
.
30 is div by 3 & 5

---------------------------------
Drop a message in skype group:
Test-1, PR #200, 30 mins*/



public class Test_1 {
	void findDivisibleNumber() {
		for (int index = 1; index <= 100; index++) {

			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index + " is divisible by 3 & 5");
			} else if (index % 3 == 0) {
				System.out.println(index + " is divisible by 3");
			} else if (index % 5 == 0) {
				System.out.println(index + " is divisible by 5");
			}
		}
	}

	public static void main(String[] args) {
		Test_1 test_1 = new Test_1();
		test_1.findDivisibleNumber();
	}
}

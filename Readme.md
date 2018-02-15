Just something using REST I threw together in five minutes while playing around with Spring. It's not advanced or complex at all since it only supports the four basic arithmetic operations and it has no error handling, but it cuts off the extra 0s from floats and it prints them to screen.

Request type: /?op=(str)&x=(float)&y=(float) with op being one of mult, div, sub, sum.

To launch it, run "mvn spring-boot:run".

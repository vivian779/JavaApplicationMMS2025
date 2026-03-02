Exercise3.15
a) Original code:if (age >= 65);
System.out.println("Age is greater than or equal to 65");
else System.out.println("Age is less than 65)");Errors:•The semicolon after if (age >= 65) terminates the if statement prematurely.•The else must directly follow the if block; here, there's a semicolon which breaks the syntax.•The closing parenthesis in the second println is misplaced.Corrected code:if (age >= 65)
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65");

 b)Original code:int x = 1, total;
while (x <= 10) {
    total += x; ++x;
}Errors:•total is declared but not initialized; it should be initialized to 0.•The += operator is correct, but since total isn't initialized, it will cause a compile error.•The code is syntactically correct otherwise.Corrected code:int x = 1, total = 0;
while (x <= 10) {
    total += x;
    ++x;
}

c)Original code:while (x <= 100)
total += x; ++x;Errors:•No braces {} for the loop body, leading to potential logical errors or confusion.•x needs to be initialized before the loop.•The increment ++x should be inside the loop body.Corrected code:int x = 1, total = 0; // assuming initialization
while (x <= 100) {
    total += x;
    ++x;
}
[12:01 AM, 2/28/2026] Morrison Vivian: )Original code:while (y > 0) {
    System.out.println(y);
    ++y;
}Errors:•The loop condition y > 0 and the increment ++y will cause an infinite loop if y starts positive, because y increases each time.•To count down or print decreasing values, decrement should be used, e.g., --y.•Alternatively, if you want to count up until some condition, the condition and logic should be adjusted.Assuming the goal is to print y until it reaches 0, decrease y:while (y > 0) {
    System.out.println(y);
    --y; // decrement y to eventually break the loop
}
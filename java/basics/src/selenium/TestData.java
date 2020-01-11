package selenium;

class TestData{
    public int number1;
    public int number2;
    public int operation;
    public String expectedResult;

    public TestData(int number1, int number2, int operation, String expectedResult) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
        this.expectedResult = expectedResult;
    }


}

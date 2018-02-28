package ua.iot.lviv;


public class Main {
    public static void main(String [] args) {
    	SomeMagicWithSrting processor = new SomeMagicWithSrting();

        String textToProcess = processor.readInputText();
        String processedString = processor.processText(textToProcess);
        processor.showResult(processedString);
    }
}

public class ArrayIsFullException extends ArrayIndexOutOfBoundsException {

    @Override
    public String getMessage() {
        return " This Array is already full ";
    }
}

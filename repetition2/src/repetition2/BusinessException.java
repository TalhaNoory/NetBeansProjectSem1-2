package repetition2;

import java.io.FileNotFoundException;

class BusinessException extends RuntimeException {

    public BusinessException(String string, FileNotFoundException ex) {
        super(string, ex);
    }
}

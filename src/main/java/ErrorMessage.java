public enum ErrorMessage {

    OTHER_NUMBER_ERROR("잘못 입력하였습니다. 1또는 2만 입력해주세요."),
    LENGTH_ERROR("잘못 입력하였습니다. 세자리수를 입력해주세요."),
    NUMBER_FORMAT_ERROR("잘못 입력하였습니다. 1~9까지의 숫자만 입력해주세요."),
    OVERLAP_ERROR("숫자가 중복입력되었습니다. 중복되지 않게 입력해주세요."),
    IOEXCEPTION_ERROR("IOException 발생");

     String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage(){
        return message;
    }
}

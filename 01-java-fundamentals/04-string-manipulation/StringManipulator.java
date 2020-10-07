public class StringManipulator{
    public String trimAndConcat(String str1, String str2) {
        String str3 = str1.trim().concat(str2.trim());
        return str3;
        //
    }
    public Integer getIndexOrNull(String Str1, char letter){
        int index = Str1.indexOf(letter);
            if (index == -1) {
                return null;
            } else {
                return index;
            }
    }
    public Integer GetIndexorNull(String Str1, String SubString){
        int index = Str1.indexOf(SubString);
        if (index == -1) {
            return null;
        } else {
            return index;
        }
    }
    public String concatSubstring(String Str1, int start, int end, String SubString){
        String str = Str1.substring(start, end);
        String result = str.concat(SubString);
        return result;
    }
}
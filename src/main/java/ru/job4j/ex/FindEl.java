package ru.job4j.ex;

public class  FindEl {
    static public int indexOf(String[] pValue, String pKey) throws ElementNotFoundException{
        int rsl = -1;
            for (int index = 0; index < pValue.length; index++) {
                if(pValue[index].equals(pKey)) {
                    rsl = index;
                    break;
                }
            }
            if(rsl == -1) {
                throw new ElementNotFoundException("The element is missing from the array !");
            }
        return rsl;
    }

    public static boolean sent(String pValue, String[] pAbuses) throws ElementNotFoundException {
        //if cintains throw ElementAbuseException
        return true;
    }

    public static void process(String[] pValue, String pKey, String[] pAbuses) {
        try {
            if (indexOf(pValue, pKey) != -1) {
                sent(pKey, pAbuses);
            }
        } catch (ElementAbuseException ea) {

        } catch (ElementNotFoundException en) {

        } catch (Exception e) {

        } catch (Throwable th) {

        }
    }

    static public void main(String[] args) {
        try {
            indexOf(new String[] {"test", null}, "test");
        } catch (ElementNotFoundException e) {

        }
    }
}

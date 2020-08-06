package ru.job4j.ex;

public class  FindEl {
    static public int indexOf(String[] pValue, String pKey) throws ElementNotFoundException {
        int rsl = -1;
            for (int index = 0; index < pValue.length; index++) {
                if (pValue[index].equals(pKey)) {
                    rsl = index;
                    break;
                }
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("The element is missing from the array !");
            }
        return rsl;
    }

    static public void main(String[] args) {
        try {
            indexOf(new String[] {
                    "test",
                    "123"
            }, "test1");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.lang.CharSequence;
public class TestClass implements CharSequence {

        @Override
        public boolean isEmpty () {
            return CharSequence.super.isEmpty();
        }
        String tence;
        public TestClass(){}
        public TestClass(String tence){
            this.tence=tence;
        }
        @Override
        public int length () {
            int value = 0;
            for (int i = 0; i < tence.length(); i++) {
                value++;
            }
            return value;
        }
        private int searchIndex(int index){
            return tence.length()-tence.length()+index;
        }
        @Override
        public char charAt ( int index){
            if ((index < 0) || (index > tence.length()-1)) {
                throw new StringIndexOutOfBoundsException(index);
            }
            return tence.charAt(index);
        }

        @Override
        public CharSequence subSequence ( int start, int end){
            if (start < 0) {
                throw new StringIndexOutOfBoundsException(start);
            }
            if (end > tence.length()) {
                //throw new StringIndexOutOfBoundsException(end);
            }
            if (start > end) {
                throw new StringIndexOutOfBoundsException(start - end);
            }
            StringBuilder sub = new StringBuilder(tence.subSequence((start),searchIndex(end)));
            return sub.reverse();
        }
        public String toString () {
            StringBuilder tence = new StringBuilder(this.tence);
            return tence.reverse().toString();
        }
    }

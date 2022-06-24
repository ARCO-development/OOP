public class Main {

    public static void main (String[] args) {    
        
        int length = args.length;
        
        if (length != 3) {
            System.out.println("digite os valores do dividendo, divisor e precisao na ordem descrita.");
        }
        else {
            String divid = args[0];
            String divis = args[1];
            String pres = args[2];
            String result = Matematica.divisao(divid, divis, pres);
            System.out.println("dividendo: " + divid  + ", divisor: "+ divis + ", precisao: " + pres + ", string de retorno: " + result);
        }
    }

    public class Matematica {
        
        public static String divisao(String dividendo, String divisor, String precisao) {
            
            double dividendoDb = Double.parseDouble(dividendo);
            double divisorDb = Double.parseDouble(divisor);
            int precisaoInt = Integer.parseInt(precisao);
            
            if ((dividendoDb > 0 || dividendoDb < 0) && divisorDb == 0 && precisaoInt < 1) {
                return "Nao foi possivel realizar a divisao";
            }
            else {
                double result = dividendoDb / divisorDb;
                String stringResult = String.valueOf(result);
                int count = 0;
                
                for (int i = 0; i < stringResult.length(); i++) {
                    if (stringResult.charAt(i) != '.') {
                        count++;
                    }
                    else {
                        break;
                    } 
                }
                int limit = count + 1 + precisaoInt;
                
                if (result % 2 != 0 && stringResult.length() >= limit) {
                    stringResult = stringResult.substring(0, limit);
                    return stringResult;  
                }
                else {
                    return stringResult;  
                }    
            }
        }

    }

}



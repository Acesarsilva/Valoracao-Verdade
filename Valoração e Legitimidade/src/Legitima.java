public class Legitima {
    public static boolean legitima(String expressao) {
        if (expressao.length() == 1 && expressao.charAt(0) >= 'A' && expressao.charAt(0) <= 'Z') {
            return true;
        }
        int inicio = 0;
        int fim = expressao.length() - 1;
        if (expressao.charAt(inicio) == '(' && expressao.charAt(fim) == ')' && expressao.charAt(inicio + 1) == '~' && inicio + 2 < fim) {
            return legitima(expressao.substring(inicio + 2, fim));
        } else if (expressao.charAt(inicio) == '(' && expressao.charAt(fim) == ')') {
            int operador = procurarOperador(expressao);
            if(operador != -1){
                return legitima(expressao.substring(inicio+1,operador -1)) && legitima(expressao.substring(operador+2,fim));
            }
        }

        return false;
    }
    public static int procurarOperador(String expressao){
        int numParentesis = 0;
        for( int cont = 0;cont < expressao.length(); cont++){
            if(expressao.charAt(cont) == '('){
                numParentesis++;
            }else if(expressao.charAt(cont) == ')'){
                numParentesis--;
            }else if((expressao.charAt(cont) == '>' || expressao.charAt(cont) == '&' || expressao.charAt(cont) == 'v')
            && numParentesis == 1 ){
                return cont;
            }
        }
        return -1;
    }
}

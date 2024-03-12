
public class quesito1 {
    public static void main(String[] args){
        int matriz[][] = {{2,3,4,5},{6,7,8,9}};
        for (int i = 0; i < matriz.length; ++i){
            for (int j = 0; j < matriz[i].length; ++j){
                System.out.format("Valor na posição [%d][%d] = %d %n" ,i, j, matriz[i][j]);
            }
        }
    }
}

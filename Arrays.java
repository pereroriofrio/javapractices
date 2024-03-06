public class Arrays {
    public static void main(String[] args){
        char[][] matriz = new char[25][25];
        char[][] matrizEjemplo = {
            {'X','_','_','_','X'},
            {'_','X','_','X','_'},
            {'_','_','X','_','_'},
            {'_','X','_','X','_'},
            {'X','_','_','_','X'}
        };//new char[5][5];
        System.out.println(matrizEjemplo.length); 
        
        mostrarX(matriz);


    }


    public static void mostrarX(char[][] matriz){
        int n = matriz.length;
        for(int i=0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n -1){
                    matriz[i][j] = 'X';
                }else{
                    matriz[i][j] = '_';
                }
            }
        }
        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(char[][] matriz){
        for(char[] fila : matriz){
            for(char c : fila){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

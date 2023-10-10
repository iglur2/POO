class TesteArray2 {

    // Criando um método que recebe um array como parâmetro
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    // Criando um método que recebe um array como parâmetro
    static void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }
    
     static void soma(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int a[] = {33, 3, 4, 5}; // Declarando e inicializando um array
        min(a); // Passando array para método
        max(a);
        average(a);
        soma(a);
    }
}

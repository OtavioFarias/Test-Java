public class Ordenacao{
	
	public static int[] sort(int[] A, int n, int k){
		
        int[] B = new int[n]; 
        int[] C = new int[k + 1];;
        
        for(int i = 0; i<=k; i++){
			 C[i] = 0;
        }
                
        for(int j = 0; j<n; j++){
			 C[A[j]]++;
        }
        
        for(int i = 1; i<=k; i++){
			 C[i] = C[i] + C[i - 1];
        }
        
       for (int j = n - 1; j >= 0; j--) { 
            B[C[A[j]] - 1] = A[j];
            C[A[j]]--; 
        }

            
        return B;
	}
	
	public static int encontrarMaximo(int[] A) {
		
		int max = A[0]; // Supondo que A não está vazio
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}
	
}



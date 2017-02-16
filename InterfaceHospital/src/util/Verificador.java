/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Micro
 */
public class Verificador {
    
     public boolean VerificaCpf(String cpf){
		char[] cpfArray = cpf.toCharArray();
		int[]numCpf = new int [11];
		int soma,peso,validador;
		
		for(int i = 0; i < 11; i++){
			numCpf[i] = Integer.parseInt(String.valueOf(cpfArray[i]));
		}
		
		
		peso=10;
		soma= 0;
		
		for(int i=0; i < 9; i++){
			soma = soma + (numCpf[i]*peso);
			peso--;
		}
		
		validador = 11- (soma % 11);
		
		if(validador > 9 ){
			validador = 0;
		}
		
		if(validador == numCpf[9]){
			soma = 0;
			peso = 11;
			
			for(int i=0; i < 10; i++){
				soma = soma + (numCpf[i]*peso);
				peso--;
			}
			
			validador = 11- (soma % 11);
			
			if(validador > 9 ){
				validador = 0;
			}
			
			if(validador == numCpf[10]){
				return true;
			}
			else{
				return false;
			}
			
		}
		else{
			return false;
		}
	}
     
     
     public boolean VerificaCnpj(String cnpj){
            char [] cnpjArray = cnpj.toCharArray();
            int [] numCnpj = new int[14];
            int soma, peso, validador;

            for(int i = 0; i < 11; i++){
                numCnpj[i] = Integer.parseInt(String.valueOf(cnpjArray[i]));
            }

             peso = 5;
             soma = 0;

            for(int i=0; i < 4; i++){
                soma = soma + (numCnpj[i]*peso);
                peso--;
            }
             peso = 9;
            
            for(int i =4; i<12;i++){
                soma = soma + (numCnpj[i]*peso);
                peso--;
            }
            
            validador = 11- (soma % 11);
			
            if(validador > 9 ){
		validador = 0;
            }
            
            if(validador == numCnpj[12]){
                
                soma = 0;
                peso = 6;
                
                for(int i=0; i < 5; i++){
                    soma = soma + (numCnpj[i]*peso);
                    peso--;
                }
                
                peso = 9;
            
                for(int i =4; i<13;i++){
                    soma = soma + (numCnpj[i]*peso);
                    peso--;
                }
                
                validador = 11- (soma % 11);
			
                if(validador > 9 ){
                    validador = 0;
                }
                
                if(validador == numCnpj[13]){
                    
                    return true;
                } else{
                    
                    return false;
                }
                
            } else{
                
                return false;
            }
            
         }
    
}

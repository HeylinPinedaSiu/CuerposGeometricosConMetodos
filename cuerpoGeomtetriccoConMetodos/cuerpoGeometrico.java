import java.util.Scanner;

public class cuerpoGeometrico {
    static Scanner lector = new Scanner(System.in);

    //declaramos las variables a usar en el programa 
    static double Generatriz;
    static double radio;
    static double Altura;
    static double apotemaPiramide;
    static double perimetroBase;
    static double Volumen;
    static double AreaTotal;
    static double AreaLateral;
    static double AreaBase;
    static double diagonal;
    static double area;
    static double Apotema;
    static double longlados;
    static double radioM;
    static double aream;
    static double volum;
    static double areaCara;
    static double Apent;
    static double AM;
    static double Am;
    static double Perimetrobase;
    static double Areabase;
    static double e,f;
    static int arista;
    static int angulo;
    static int Lados;
    
    public static void main(String[] args) throws Exception {
       menu();
    
    }
    //creamos un metodo para mostrar el menu 
    public static int menu(){
       System.out.println("Calcular el area lateral,total y volumen.");
       System.out.println("Menu de opciones: ");
       System.out.println("1)Prisma");
       System.out.println("2)Cilindro");
       System.out.println("3)Pirámide"); 
       System.out.println("4)Cono");
       System.out.println("5)Esfera");
       System.out.println("6)Zona Esférica");
       System.out.println("7)Casquete Esférico");
       System.out.println("8)Huso esférico y cuña esférica");
       System.out.println("9)Ortoedro");
       System.out.println("10)Tetaedro");
       System.out.println("11)Hexaedro");
       System.out.println("12)Octaedro");
       System.out.println("13)Dodecaedro");
       System.out.println("14)Icosaedro");
       System.out.println("15)Tronco de cono");
       System.out.println("16)Tronco de pirámide");
       System.out.println("17)Salir");
       //
       int opc;
       int intentos = 0;
       double r1,s1,t1;

       do{
        System.out.print("Ingresa una opción: ");
        opc = lector.nextInt();
        
        if(opc < 1 || opc > 17){
         intentos++;

        if(intentos < 3){
            System.out.println("Valor invalido.");

            }else{
                System.out.println("Error! usted supero el numero de intentos.El programa finalizara");
                System.exit(0);
            }

         }else{
            intentos = 0;
         }

        }while(intentos < 3 && (opc < 1  || opc > 17 ));

        //´pedimos los datos de las diferentes figuras geometricas 
        //detro del switch
        switch(opc){
            case 1:
            do {
                //pedimos datos al usuario 
                System.out.print(" Ingresa la Cantidad de  lados: ");
                Lados = lector.nextInt();
      
                if (Lados <= 0) {
                 System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                    intentos++;

                } else {
                    break;
                } 

              } while (intentos < 3);
      
              if (intentos == 3) {
                System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                break;

              } else {
                intentos = 0; 
      
                do {
                    System.out.print("Altura: ");
                 Altura = lector.nextDouble();
      
                    if (Altura <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
      
                if (intentos == 3) {
                    System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                    break;
                  
                } else {
                    intentos = 0; 

                    do {
                        //pedimos datos al usuario
                        System.out.print("Longitud de los lados: ");
                        longlados = lector.nextDouble();
      
                        if (longlados <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
      
                    if (intentos == 3) {
                        System.out.println("Error! ustd superó el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                    }  
                  }  
                  
   
                  CalcularPrisma (Lados,Altura,longlados);
           
             
            break;
            
            case 2:
            do {
                System.out.print("Ingrese la altura: ");
                Altura = lector.nextDouble();
      
                if (Altura <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }

            } while (intentos < 3);
      
            if (intentos == 3) {
                System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                break;
            } else {
                intentos = 0; 
                do {
                    System.out.print("Ingrese el radio: ");
                    radio = lector.nextDouble();
      
                    if (radio <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                  } while (intentos < 3);
      
                 if (intentos == 3) {
                    System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                    break;
                  }
              }
                 CalcularCilindro(radio, Altura);
      
            break;
            
            case 3:
            //pedimos losd atos la usuario
            do {
                System.out.print("Ingresa la altura de la piramide: ");
                Altura = lector.nextDouble();
            
                if (Altura <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Por favor intente  nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
            
              if (intentos == 3) {
                System.out.println("Error!! superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
            
                do {
                    System.out.print("Ingrese la cantidad de lados de la piramide: ");
                    Lados= lector.nextInt();
            
                    if (Lados <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
            
                if (intentos == 3) {
                    System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                   break;
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el apotema de la piramide: ");
                        apotemaPiramide = lector.nextDouble();
            
                        if (apotemaPiramide <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Por favor nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
            
                    if (intentos == 3) {
                        System.out.println("\"Error!! usted  supero el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                    }  
                    do {
                        System.out.print("Ingrese la longitud de los lados: ");
                        longlados = lector.nextDouble();
                
                        if (longlados <= 0) {
                            System.out.println("El valor debe ser mayor a cero.  Por favor nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
                
                    if (intentos == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } else {
                        intentos = 0; 
                        do {
                            System.out.print("Ingrese el apotema de la base: ");
                            Apotema = lector.nextDouble();
                
                            if (Apotema <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor  nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } while (intentos < 3);
                
                        if (intentos == 3) {
                            System.out.println("Error! usted   superó el número máximo de intentos. El programa finalizará.");
                            break;
                          }
                        } 
                  } 

                  CalcularPiramide( Altura,Lados,apotemaPiramide,longlados);  
                  
            break;
          case 4:
          do {
            //pedimos losdatos al usuario 
            System.out.print("Ingrese la altura del cono: ");
            Altura = lector.nextDouble();
  
            if (Altura <= 0) {
                System.out.println("El valor debe ser mayor a cero. Por favor intenta  nuevamente.");
                intentos++;
            } else {
                break;
            }
        } while (intentos < 3);
  
        if (intentos == 3) {
            System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
            break;
        } else {
            intentos = 0; 
            do {
                System.out.print("Ingrese el radio del cono: ");
                radio = lector.nextDouble();
  
                if (radio <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
  
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
          }
              CalcularCono(radio,Altura);
          break;

          case 5:
          do {
            System.out.print("Ingrese el valor del radio: ");
            radio = lector.nextDouble();
  
            if (radio <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos++;
            } else {
                break;
            }
          } while (intentos < 3);
  
         if (intentos == 3) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          }

           CalcularEsfera(radio);
          break;

           case 6:
            do {
                System.out.print("Ingresa la altura: ");
                Altura = lector.nextDouble();
            
                if (Altura <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
            
              if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
            
                do {
                    System.out.print("Ingrese el radio menor: ");
                    radio = lector.nextDouble();
            
                    if (radio <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
            
                if (intentos == 3) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                    break;
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el radio Mayor: ");
                        radioM = lector.nextDouble();
            
                        if (radioM <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
            
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                    }  
                  }   
                   
                  CalcularZonaEsferica( radio, radioM, Altura);
            break;
            case 7:
            do {
                System.out.print("Ingresa la altura: ");
                Altura = lector.nextDouble();
            
                if (Altura <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
            
              if (intentos == 3) {
                System.out.println("Error! superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
            
                do {
                    System.out.print("Ingrese el radio Mayor: ");
                    radioM = lector.nextDouble();
            
                    if (radioM <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
            
                if (intentos == 3) {
                    System.out.println("Error! superó el número máximo de intentos. El programa finalizará.");
                    break;
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el radio menor: ");
                        radio = lector.nextDouble();
            
                        if (radio <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
            
                    if (intentos == 3) {
                        System.out.println("Error superó el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                  }  
              }   
               calcularCasqueteEsferico(Altura,radio,radioM);
            break;

            case 8:
            do {
                System.out.print("Ingresa el valor del radio: ");
                radio = lector.nextDouble();
    
                if (radio <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
    
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              
            } else {
                intentos = 0; 
                do {
                    System.out.print("Ingrese el valor del ángulo: ");
                    angulo = lector.nextInt();
    
                    if (angulo <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
    
                if (intentos == 3) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                    break;
                  }
                }  
                calcularHusoCuñaEsferica(radio,angulo);

            break;

            case 9:
            do {
                System.out.print("Ingresa el valor de a: ");
                r1 = lector.nextDouble();
        
                if (r1 <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
        
              if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
        
                do {
                    System.out.print("Ingresa el valor de b: ");
                     s1 = lector.nextDouble();
        
                    if (s1 <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                    
                } while (intentos > 3);
                if (intentos == 3) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                    break;
                  
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el valor de c: ");
                        t1 = lector.nextDouble();
        
                        if (t1 <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos > 3 );
        
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                      }
                    }  
                  }  
                 CalcularOrtoedro(r1, s1, t1);
            
            break;

            case 10:
            while (intentos < 3) {
                System.out.print("Ingrese el valor de la arista: ");
                arista = lector.nextInt();
    
                if (arista <= 0) {
                    System.out.println("La longitud de la arista debe ser mayor que cero. Inténtelo de nuevo.");
                    intentos++;
                } else {
                    break; 
                }
            }
    
            if (intentos == 3) {
                System.out.println("Se ha excedido el número máximo de intentos. Programa terminado.");
                break;
            }
            calcularTetaedro(arista);
             
            break;

            case 11:
            do {
                System.out.print("Ingresa el valor de la arista: ");
                arista = lector.nextInt();
    
                if (arista <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
    
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              
            } else {
                intentos = 0; 
                }
                 calcularHexaedro(arista);
            break;

            case 12:
            do {
                System.out.print("Ingresa el valor de la arista: ");
                arista = lector.nextInt();
    
                if (arista <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
    
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              
            } else {
                intentos = 0; 
                }
                calcularOctaedro(arista);
            
            break;

            case 13:
            do {
                System.out.print("Ingresa el valor de la arista: ");
                arista = lector.nextInt();
    
                if (arista <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
    
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              
            } else {
                intentos = 0; 
                }
                calcularDodecaedro(arista);
    
            break;

            case 14:
            do {
                System.out.print("Ingresa el valor de la arista: ");
                arista = lector.nextInt();
    
                if (arista <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } while (intentos < 3);
    
            if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              
            } else {
                intentos = 0; 
                }
                calcularIcosaedro(arista);

            break;
            
            case 15:
            do {
                System.out.print("Ingresa la altura: ");
                Altura = lector.nextDouble();
            
                if (Altura <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
            
              if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
            
                do {
                    System.out.print("Ingrese el radio menor: ");
                    radio = lector.nextInt();
            
                    if (radio <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
            
                if (intentos == 3) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el radio Mayor: ");
                        radioM = lector.nextDouble();
            
                        if (radioM <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
            
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                    }  
                  }   
                  calcularTroncodeCono(Altura,radio,radioM);
            break;
            
            case 16:
            do {
                System.out.print("Ingresa la longitud da la arista mayor: ");
                AM = lector.nextDouble();
            
                if (AM <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos++;
                } else {
                    break;
                } 
              } while (intentos < 3);
            
              if (intentos == 3) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              } else {
                intentos = 0; 
            
                do {
                    System.out.print("Ingrese la longitud de la arista menor: ");
                    Am = lector.nextDouble();
            
                    if (Am <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos++;
                    } else {
                        break;
                    }
                } while (intentos < 3);
            
                if (intentos == 3) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                    break;
                } else {
                    intentos = 0; 
                    do {
                        System.out.print("Ingrese el valor de la altura: ");
                        Altura = lector.nextDouble();
            
                        if (Altura <= 0) {
                            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                            intentos++;
                        } else {
                            break;
                        }
                    } while (intentos < 3);
            
                    if (intentos == 3) {
                        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                        break;
                      }
                    }  
                  }   
                  calcularTroncodepiramide(Altura,Am,AM);
      
            break;

            case 17:
                   System.out.println("Ha decidido salir del programa.¡Vuelva pronto!(*u*)");
            break;
            

        }

      return opc;
      
       }


       /*Creamos metodos para hace las debidas operaciones 
        * de las diferentes figuras Geometricas
        */
       public static void CalcularPrisma(int cantidadLados,double altura,double longitudLados){
         perimetroBase = cantidadLados * longitudLados;
         AreaLateral = perimetroBase* Altura;
         double alfa = (Math.PI/180) * (360/cantidadLados);
          Apotema = longitudLados / (2 * Math.tan((alfa)/2));
          AreaBase = (perimetroBase * Apotema)/2;
         AreaTotal = AreaLateral + 2 * AreaBase; 
          Volumen = AreaBase * altura;

          //mostramos los resultados del prisma
         System.out.println("Area lateral: " + AreaLateral);
         System.out.println("Area total: " + AreaTotal );
         System.out.println("Volumen: " + Volumen);
        
       }

       public static void CalcularCilindro(double radio,double altura){
         perimetroBase = 2*Math.PI*radio;
         AreaLateral = perimetroBase*altura;
         AreaBase= Math.PI* (radio*radio);
         AreaTotal = 2*Math.PI*radio*(altura + radio);
         Volumen = AreaBase*altura;

         //mostramos los resultados de cilindro
        System.out.println("El Area Lateral del ciliendro es: " + AreaLateral);
        System.out.println("El Area Total del cilindro es: " + AreaTotal );
        System.out.println("El volumen del cilindro es: " + Volumen);
            }
        
         public static void CalcularPiramide(double altura,int cantidadLados,double apotemaPiramide,double longitudLados){
         perimetroBase = cantidadLados * longitudLados;
         apotemaPiramide = (Math.sqrt(altura*altura)+(Apotema*Apotema));
         AreaLateral = (perimetroBase*apotemaPiramide)/2;
         AreaBase = perimetroBase*2*(Apotema+apotemaPiramide);
         AreaTotal = (AreaLateral+AreaBase);
         Volumen = (AreaBase+altura)/3;

         //mostramos los resultados de tronco piramide
         System.out.println("El area Lateral de la pirámide es: "+AreaLateral);
         System.out.println("El area total de la pirámide es "+AreaTotal);
         System.out.println("El volumen de la pirámide es: "+Volumen);
        }

        public static void CalcularCono(double radio,double altura){
         perimetroBase = (Math.PI*radio);
         Generatriz = Math.sqrt((radio*radio)+(altura*altura));
         AreaLateral = perimetroBase*Generatriz;
         AreaBase = (Math.PI*(radio*radio));
         AreaTotal = AreaLateral + AreaBase;
         Volumen = AreaBase*altura/3;

         //mostramos los resultados de cono
         System.out.println("El area lateral el cono es: "+AreaLateral);
         System.out.println("El area total del cono es: "+AreaTotal);
         System.out.println("el volumen del cono es: "+Volumen);
        }

       public static void  CalcularEsfera(double radio){
          area = 4*Math.PI*(radio*radio);
          Volumen = 4.0/3.0*Math.PI*(radio*radio*radio);

          //mostramos los resultados de  la esfera
         System.out.println("El valor del area es: "+area);
         System.out.println("El valor del volumen es: "+Volumen);
       }

       public static void CalcularZonaEsferica(double radio,double radioM,double altura){
         area = 2*Math.PI*radioM*altura;
         Volumen = Math.PI*altura*((altura*altura)+3*radioM+3*radio)/6;

         //mostramos los resultados de zona esferica 
         System.out.println("El area de la zona esferica es: "+area);
         System.out.println("El volumen de la zona esferica es: "+Volumen);
       }

       public static void calcularCasqueteEsferico(double altura,double radio,double radioM){
        area = 2*Math.PI*radioM*altura;
        aream = Math.PI*((radio*radio)+(altura*altura));
        Volumen = Math.PI*(altura*altura)*(3*radioM-altura)/3;
        volum= Math.PI*altura/6*(3*(radio*radio)+(altura*altura));
   
        //mostramos los resultados de  casquete esferico
        System.out.println("Area en funcion del radio de la esfera: "+area);
        System.out.println("Area en funcion del radio menor: "+aream);
        System.out.println("volumen en funcion del radio de la esfera: "+Volumen);
        System.out.println("Area en funcion del radio menor: "+volum);

       }

       public static void calcularHusoCuñaEsferica(double radio,double angulo){
         area = 4*(Math.PI*(radio*radio)*angulo/360);
         Volumen = (4.0/3.0)*(Math.PI*(radio*radio*radio)*angulo/360);

         //mostramos los resultados de thueso y cuña esferica 
         System.out.println("El area del uso esferico es: "+area); 
         System.out.println("El volumen de una cuña esferica es: "+Volumen);
       }

       public static void CalcularOrtoedro(double a,double b,double c){
         area = 2*(a*b+a*c+b*c);
         diagonal = Math.sqrt((a*a)+(b*b)+(c*c));
         Volumen = a*b*c;

         //mostramos los resultados de ortoedro
        System.out.println("El valor del area es: "+area);
        System.out.println("El valor del volumen es: "+Volumen);
        System.out.println("El valor de la diagonal es: "+diagonal);
       }

       public static void calcularTetaedro(int arista){
             area = ((arista*arista)*Math.sqrt(3));
             Altura = (arista*(Math.sqrt(6)/3));
             Volumen = ((Math.sqrt(2)/12)*(arista*arista*arista));
    
             //mostramos los resultados de tetaedro
             System.out.println("El valor del area es: "+area);
             System.out.println("El valor de la altura es: "+Altura);
             System.out.println("El valor del volumen es: "+Volumen);

       }

       public static void calcularHexaedro(int arista){
        area = (6*(arista*arista));
        Volumen = (arista*arista*arista);
       diagonal = (arista*Math.sqrt(3));

       //mostramos los resultados de hexaedro
       System.out.println("El area del hexaedro es: "+area); 
       System.out.println("El volumen del hexaedro es: "+Volumen);
       System.out.println("La diagonal del hexaedro es: "+area);
       }
       
      public static void calcularOctaedro(int arista){
        AreaTotal = (2*(arista*arista)*Math.sqrt(3));
        areaCara = AreaTotal/8;
        Volumen = Math.sqrt(2)/3*(arista*arista*arista);

        //mostramos los resultados de octaedro
       System.out.println("El valor del area Total es: "+AreaTotal);
       System.out.println("El valor del area de la cara es: "+areaCara);
       System.out.println("El valor del volumen es: "+Volumen);
      }

      public static void calcularDodecaedro(int arista){
         double alfa = 36*(Math.PI/180);
         Apotema = (arista/2*Math.tan(alfa));
         area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
         Apent = 5/2*arista*Apotema;
         Volumen = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

         //mostramos los resultados de dodeaedro
         System.out.println("El area del Dodecaedro es: "+area);
         System.out.println("El area de un pentagono del dodecaedro es: "+Apent);
         System.out.println("El volumen del dodecaedro es: "+Volumen);
      }

      public static void calcularIcosaedro(int arista){
         AreaTotal = (5*(arista*arista)*Math.sqrt(3));
         areaCara = AreaTotal/20;
         Volumen = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

         //mostramos los resultados de icosaedro
         System.out.println("El valor del area Toltal es: "+AreaTotal);
         System.out.println("El valor del area de las caras es: "+areaCara);
         System.out.println("El valor del volumen es: "+Volumen);
      }

      public static void calcularTroncodeCono(double altura,double radio,double radioM){
         Generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
         AreaLateral = Math.PI*Generatriz*(radioM+radio);
         AreaBase = Math.PI*radioM;
         Areabase = Math.PI*radio;
         AreaTotal = AreaLateral + AreaBase+ Areabase;
         Volumen = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);

        //mostramos los resultados de tronco de cono
         System.out.println("El area lateral es: "+AreaLateral);
         System.out.println("El area total es: "+AreaTotal);
         System.out.println("El volumen es: "+Volumen);
      }

      public static void calcularTroncodepiramide(double altura,double Am, double AM){
                f= (AM-Am)/2;
                e = Math.sqrt((altura*altura)+(f*f));
                perimetroBase = AM*altura; 
                Perimetrobase = Am*altura;
                AreaLateral = (perimetroBase+Perimetrobase)/2*e;
                AreaBase = (AM*AM);
                Areabase = (Am*Am);
                AreaTotal= AreaLateral+AreaBase+Areabase;
                Volumen = 1.0/3*altura*(AreaBase+Areabase+Math.sqrt(AreaBase*Areabase));
      
                   //mostramos los resultados de tronco de piramide 
                System.out.println("El area lateral es igual a: "+AreaLateral);
                System.out.println("El area total es igual a: "+AreaTotal);
                System.out.println("El volumen es igual a: "+Volumen);

      }
       
     }

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ShapeBean {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre a quantidade de Figuras: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Shape> shapes = new ArrayList<>();
		
		//Begin
		for(int i=1;i<=n;i++) {
			System.out.println("Dados da Figura #" + i);
			
			System.out.print("Retângulo ou Circulo (r/c): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Cor (BLACK, BLUE, RED): ");
			Color color = Color.valueOf(sc.next());
			  
			switch(tipo) {
			
			  case 'r':
				  System.out.print("Largura: ");
				  double width = sc.nextDouble();
				  
				  System.out.print("Altura: ");
				  double height = sc.nextDouble();				  
				  
				  shapes.add(new Rectangle(color, width, height));
				  
				  break;
				  
			  case 'c':
				  System.out.print("Raio: ");
				  double radius = sc.nextDouble();
				  
				  shapes.add(new Circle(color, radius));
				  
				  break;
			}
		}
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
		
		sc.close();

	}

}

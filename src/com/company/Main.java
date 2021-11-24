package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) throws MyException {
                while (true) {
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Для какой фигуры надо рассчитать площадь и объём ?");
                    System.out.println("     {  сфера, параллелепипед, цилиндр, конус }    ");
                    String shape = scanner.nextLine();

                    switch (shape.toLowerCase(Locale.ROOT)) {
                        case "параллелепипед": {
                            try {
                                System.out.println("Введите длину: ");
                                int lengthOfParallelepiped = scanner.nextInt();
                                if (lengthOfParallelepiped < 0) {
                                    throw new MyException();
                                }
                                System.out.println("Введите ширину: ");
                                int widthOfParallelepiped = scanner.nextInt();
                                if (widthOfParallelepiped < 0) {
                                    throw new MyException();
                                }
                                System.out.println("Введите высоту: ");
                                int heightOfParallelepiped = scanner.nextInt();
                                if (heightOfParallelepiped < 0) {
                                    throw new MyException();
                                }
                                Parallelepiped parallelepiped = new Parallelepiped(lengthOfParallelepiped, widthOfParallelepiped, heightOfParallelepiped);
                                parallelepiped.area();
                                parallelepiped.volume();
                            } catch (MyException e1) {
                                System.out.println("Цифры должны быть больше нуля!!!");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Данные должны состоять из цифр!!!");
                            }
                        }
                        break;
                        case "сфера": {
                            try {
                                System.out.println("Введите радиус: ");
                                int radiusOfSphere = scanner.nextInt();
                                if (radiusOfSphere < 0) {
                                    throw new MyException();
                                }
                                Sphere sphere = new Sphere(radiusOfSphere);
                                sphere.area();
                                sphere.volume();
                            } catch (MyException e2) {
                                System.out.println("Цифры должны быть больше нуля!!!");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Данные должны состоять из цифр!!!");
                            }
                        }
                        break;
                        case "цилиндр": {
                            try {
                                System.out.println("Введите высоту: ");
                                int heightOfCylinder = scanner.nextInt();
                                if (heightOfCylinder < 0) {
                                    throw new MyException();
                                }
                                System.out.println("Введите радиус: ");
                                int radiusOfCylinder = scanner.nextInt();
                                if (radiusOfCylinder < 0) {
                                    throw new MyException();
                                }
                                Cylinder cylinder = new Cylinder(Math.PI, radiusOfCylinder, heightOfCylinder);
                                cylinder.area();
                                cylinder.volume();
                            } catch (MyException e3) {
                                System.out.println("Цифры должны быть больше нуля!!!");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Данные должны состоять из цифр!!!");
                            }
                        }
                        break;
                        case "конус": {
                            try {
                                System.out.println("Введите высоту: ");
                                int heightOfCone = scanner.nextInt();
                                if (heightOfCone < 0) {
                                    throw new MyException();
                                }
                                System.out.println("Введите радиус: ");
                                int radiusOfCone = scanner.nextInt();
                                if (radiusOfCone < 0) {
                                    throw new MyException();
                                }
                                Cone cone = new Cone(radiusOfCone, heightOfCone);
                                cone.area();
                                cone.volume();
                            } catch (MyException e4) {
                                System.out.println("Цифры должны быть больше нуля!!!");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Данные должны состоять из цифр!!!");
                            }
                        }
                        break;
                        default: {
                            System.out.println("Введите фигуру правильно!!!");
                        }
                    }
                }
            }
        }

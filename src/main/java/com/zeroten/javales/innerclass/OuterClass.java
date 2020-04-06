package com.zeroten.javales.innerclass;

public class OuterClass {
    private Integer index;
    private String name;

    public OuterClass(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public class InnerClass2 {
            public class InnerClass3 {

            }
        }

        public void printInfo() {
           /* StringBuilder tmp = new StringBuilder();
            tmp.append("外围类index=");
            tmp.append(OuterClass.this.index);
            tmp.append("，外围类name=");
//            tmp.append(OuterClass.this.name);
            tmp.append(name);
            System.out.println(tmp.toString());*/

            /*String name = "局部方法";
            class printClass {
                void print() {
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(OuterClass.this.index);
                    tmp.append("，外围类name=");
                    tmp.append(OuterClass.this.name);
//                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }
            new printClass().print();*/

            /*class PrintInterfaceImpl implements PrintInterface{
                @Override
                public void print() {

                }
            }
            new PrintInterfaceImpl().print();*/

            /*new PrintInterface() {
                @Override
                public void print() {
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(OuterClass.this.index);
                    tmp.append("，外围类name=");
                    tmp.append(OuterClass.this.name);
//                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();*/

            /*class PrintAbstractImpl extends PrintAbstract {
                @Override
                void print() {

                }
            }
            new PrintAbstractImpl().print();*/

            /*new PrintAbstract() {
                @Override
                void print() {
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(OuterClass.this.index);
                    tmp.append("，外围类name=");
                    tmp.append(OuterClass.this.name);
//                    tmp.append(name);
                    System.out.println(tmp.toString());
                }

            }.print();*/

            class PrintClassNew extends PrintClass {

            }
            new PrintClassNew().print();

            new PrintClass() {
                @Override
                public void print() {
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(OuterClass.this.index);
                    tmp.append("，外围类name=");
                    tmp.append(OuterClass.this.name);
//                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();

        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1, "外部类");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("内部类");
        innerClass.printInfo();
    }
}

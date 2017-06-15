package com.javarush.task.task24.task2405;

/* 
Black box
*/
public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        //!!!!! Changes can be here
        //!!!!! Изменения могут быть тут


            //!!!!! All changes have to be here
            //!!!!! Все изменения должны быть только тут
            //метод someAction анонимного класса поля solutionAction должен вызвать метод сабкласса FirstClass, если param > 0, иначе вызвать метод сабкласса SecondClass.
            //2. Для вывода должны быть использованы строковые константы объявленные в классе SecondClass.
            //3. В методе someAction анонимного класса Action созданного в классе Solution должен содержаться вызов метода someAction родительского класса (super.someAction()).
            //4. В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа FirstClass.
            //5. В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа SecondClass.
            public void someAction() {
                //!!!!! All changes have to be here
                //!!!!! Все изменения должны быть только тут
                FirstClass firstClass;
                SecondClass secondClass = new SecondClass();

                if (param>0){
                    firstClass = new FirstClass() {
                        @Override
                        public Action getDependantAction() {
                            while (param>0){
                                System.out.println(param--);
                            }
                            super.someAction();
                            return new Action() {
                                @Override
                                public void someAction() {
                                }
                            };
                        }
                    };
                    firstClass.getDependantAction();
                }
                secondClass.someAction();
                System.out.println(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.replaceAll("\n","") + param);
            }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}

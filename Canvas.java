package com.javarush.task.task24.task2413;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public int getWidth() {
        return width;
    }

    public int getHeight(){
        return height;
    }

    public char[][] getMatrix(){
        return matrix;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    //в) Добавить конструктор с двумя параметрами типа int (width и height), поле matrix должно быть инициализировано пустым массивом размерностью [height+2][width+2].
    public Canvas(int width,int height){
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public void setPoint(double x, double y, char c){
        /*а) округлить x и y до целых чисел, используя метод Math.round()
б) занести в matrix[y][x] значение с
в) ничего не делать, если x < 0 или y < 0 или y >= matrix.length или x >= matrix[0].length*/
        int coord_y = (int) Math.round(y);
        int coord_x = (int) Math.round(x);
        if (!(x < 0 || y < 0 || y >= matrix.length || x >= matrix[0].length))
            matrix[coord_y][coord_x] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){
        /*а) с помощью двух вложенных циклов пройтись по всем ячейкам переданной картинки
б) если значение ячейки элемента [i][j] полученной матрицы не равно 0, то покрасить в матрице объекта Canvas точку (x+j, y+i) в цвет c:
setPoint(x+j, y+i, c)*/
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] != 0){
                    setPoint(x+j, y+i, c);
                }
            }
        }
    }

    public void clear(){
        matrix = new char[height + 2][width + 2];
    }

    public void print(){
        for(int i = 0; i < height + 2; i++){
            for (int j = 0; j < width + 2; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


}

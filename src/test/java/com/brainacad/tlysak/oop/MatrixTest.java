package com.brainacad.tlysak.oop;


import com.brainacad.tlysak.oop.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by tymur on 7/1/16.
 */
public class MatrixTest {

    @Test
    public void summTest() {
        Matrix matrix1 = new Matrix();
        matrix1.setState(new int[][]{{1,1},
                                     {1,1}});

        Matrix matrix2 = new Matrix();
        matrix2.setState(new int[][]{{2,12},
                                     {-5,2}});

        matrix1.summ(matrix2);
        assertArrayEquals(matrix1.getState(), new int[][]{{3,13},
                                                                 {-4,3}});


    }
}

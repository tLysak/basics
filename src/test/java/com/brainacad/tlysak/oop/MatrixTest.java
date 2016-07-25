package com.brainacad.tlysak.oop;


import com.brainacad.tlysak.oop.Matrix;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tymur on 7/1/16.
 */
public class MatrixTest {

    @Test
    public void summTest_ShouldCalculatePositiveIntegerMatrices() {
        Matrix matrix1 = new Matrix();
        matrix1.setState(new int[][]{{1,1},
                                     {1,1}});

        Matrix matrix2 = new Matrix();
        matrix2.setState(new int[][]{{2,12},
                                     {5,2}});

        matrix1.summ(matrix2);
        assertArrayEquals("You are stupid", matrix1.getState(), new int[][]{{3,13},
                                                                 {6,3}});


    }

    @Test
    public void sum () {
        assertTrue("You are very st", false);
    }
}

package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

import java.awt.*;

/**
 * Created by fukuro on 4/9/16.
 */
public class ImageReaderFactory
{

    public static ImageReader getReader(ImageTypes imageTypes)

    {
        ImageReader imageReader;

        if (imageTypes == ImageTypes.JPG)
        {
            imageReader = new JpgReader();
        }
        else if (imageTypes == ImageTypes.PNG)
        {
            imageReader = new PngReader();
        }
        else if (imageTypes == ImageTypes.BMP)
        {
            imageReader = new BmpReader();
        }
        else {
            throw new  IllegalArgumentException("Неизвестный тип картинки");
        }

        return imageReader;
    }
}


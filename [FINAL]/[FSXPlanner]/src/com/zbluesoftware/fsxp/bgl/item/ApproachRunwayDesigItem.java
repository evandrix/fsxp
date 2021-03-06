// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ApproachRunwayDesigItem.java

package com.zbluesoftware.fsxp.bgl.item;


// Referenced classes of package com.zbluesoftware.fsxp.bgl.item:
//            Item

public class ApproachRunwayDesigItem extends Item
{

    public ApproachRunwayDesigItem()
    {
        this("runwayDesignator");
    }

    public ApproachRunwayDesigItem(String name)
    {
        this.name = name;
        dataType = "Byte";
        offset = 0;
        length = 1;
        hexData = null;
        decodedData = null;
    }

    public void setDecodedData()
    {
        String tempHex = hexData.replaceAll(" ", "");
        StringBuffer buffer = new StringBuffer();
        for(int i = tempHex.length() - 1; i >= 0; i -= 2)
            buffer.append(tempHex.charAt(i - 1)).append(tempHex.charAt(i));

        int tempData = Long.valueOf(buffer.toString(), 16).intValue();
        StringBuffer binary = new StringBuffer(Long.toBinaryString(tempData));
        for(int i = binary.length(); i < 8; i++)
            binary.insert(0, "0");

        int dataInt = Long.valueOf(binary.substring(1, 4), 2).intValue();
        switch(dataInt)
        {
        case 0: // '\0'
            decodedData = "NONE";
            return;

        case 1: // '\001'
            decodedData = "LEFT";
            return;

        case 2: // '\002'
            decodedData = "RIGHT";
            return;

        case 3: // '\003'
            decodedData = "CENTER";
            return;

        case 4: // '\004'
            decodedData = "WATER";
            return;

        case 5: // '\005'
            decodedData = "A";
            return;

        case 6: // '\006'
            decodedData = "B";
            return;
        }
    }
}

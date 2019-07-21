/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.easyexceltest.test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Test;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import com.cloud.pojo.entities.Student;
import com.cloud.pojo.entities.UserModel;

/**
 * @authur wtj
 * @date 2019/6/15    23:01
 */
public class EasyExeclWriteTest {

    /**
     * 基于注解方式，比较简单常用的一种
     * @throws Exception
     */
   @Test
    public void writeExcel1() throws Exception {
        // 文件输出位置
        OutputStream out = new FileOutputStream("D:/easyexcel/test.xlsx");

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0, UserModel.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write(createModelList(), sheet1);

        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }

    private List<? extends BaseRowModel> createModelList() {
        List<UserModel> userModels = new ArrayList<>();
        for(long i = 0;i<100;i++){
            UserModel userModel = new UserModel();
            userModel.setId(i+1);
            userModel.setName("userName"+i);
            userModel.setAge((int)Math.random());
            userModels.add(userModel);
        }
        return userModels;
    }

    /**
     * 动态生成excel
     * @throws Exception
     */
    @Test
    public void writeExcel2() throws Exception {
        // 文件输出位置
        OutputStream out = new FileOutputStream("D:/easyexcel/test2.xlsx");

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0,Student.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        Table table = new Table(1);
        table.setHead(ExcelUtil.createExcelHead());


        // 写数据到

      writer.write1(createModelList2(), sheet1,table);
        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }

    private List<List<Object>> createModelList2() {


        List<List<Object>> lists = new ArrayList<>();
        for(long i = 0; i < 100; i++ ){
            List<Object> list = new ArrayList<>();
            list.add(i+"1");
            list.add("name" + i);
            list.add(i+"");
            list.add("male");
            list.add(i+"");

            lists.add(list);

        }
        return lists;
    }


    static class ExcelUtil{

        public static List<List<String>> createExcelHead() {
            // 原形上没有注解，表头数据动态生成
            List<List<String>> head = new ArrayList<List<String>>();
            List<String> headCoulumn1 = new ArrayList<String>();
            List<String> headCoulumn2 = new ArrayList<String>();
            List<String> headCoulumn3 = new ArrayList<String>();
            List<String> headCoulumn4 = new ArrayList<String>();
            List<String> headCoulumn5 = new ArrayList<String>();
//
//            headCoulumn1.add("第一列");
//            headCoulumn2.add("第二列");
//
//            headCoulumn3.add("第三列");
//            headCoulumn4.add("第四列");
//            headCoulumn5.add("第五列");


            /**
             * 无注解模式，动态添加表头，也可自由组合表头，代码如下
             */

            headCoulumn1.add("第一列");headCoulumn1.add("第一列");headCoulumn1.add("第一列");
            headCoulumn2.add("第一列");headCoulumn2.add("第一列");headCoulumn2.add("第一列");

            headCoulumn3.add("第二列");headCoulumn3.add("第二列");headCoulumn3.add("第二列");
            headCoulumn4.add("第三列");headCoulumn4.add("第三列2");headCoulumn4.add("第三列2");
            headCoulumn5.add("第一列");headCoulumn5.add("第3列");headCoulumn5.add("第4列");


            head.add(headCoulumn1);
            head.add(headCoulumn2);
            head.add(headCoulumn3);
            head.add(headCoulumn4);
            head.add(headCoulumn5);
            return head;
        }

        public static TableStyle createTableStyle() {

            TableStyle tableStyle = new TableStyle();
            // 设置表头样式
            Font headFont = new Font();
            // 字体是否加粗
            headFont.setBold(true);
            // 字体大小
            headFont.setFontHeightInPoints((short)12);
            // 字体
            headFont.setFontName("楷体");
            tableStyle.setTableHeadFont(headFont);
            // 背景色
            tableStyle.setTableHeadBackGroundColor(IndexedColors.BLUE);


            // 设置表格主体样式
            Font contentFont = new Font();
            contentFont.setBold(true);
            contentFont.setFontHeightInPoints((short)12);
            contentFont.setFontName("黑体");
            tableStyle.setTableContentFont(contentFont);
            tableStyle.setTableContentBackGroundColor(IndexedColors.GREEN);
            return tableStyle;
        }
    }

    /**
     * 自定义表头以及内容样式
     */
    @Test
    public void writeExcel3() throws Exception {
        // 文件输出位置
        OutputStream out = new FileOutputStream("D:/easyexcel/test2.xlsx");

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0,Student.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        Table table = new Table(1);

        // 自定义表格样式
        table.setTableStyle(ExcelUtil.createTableStyle());

        // 无注解模式动态添加表头
        table.setHead(ExcelUtil.createExcelHead());


        // 写数据到

        writer.write1(createModelList2(), sheet1,table);
        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }

    /**
     * 合并单元格
     */

    @Test
    public void writeExcel4() throws Exception {
        // 文件输出位置
        OutputStream out = new FileOutputStream("D:/easyexcel/test2.xlsx");

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0,Student.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        Table table = new Table(1);

        // 自定义表格样式
        table.setTableStyle(ExcelUtil.createTableStyle());

        // 无注解模式动态添加表头
        table.setHead(ExcelUtil.createExcelHead());


        // 写数据
        writer.write1(createModelList2(), sheet1,table);

        // 合并单元格 ，下标从0开始：第九行到 第十一行，第一列到第五列
        writer.merge(8,10,0,4);

        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }

    /**
     * 自定义处理：EasyExcel预留了WriteHandler接口，允许自定义代码
     */
}

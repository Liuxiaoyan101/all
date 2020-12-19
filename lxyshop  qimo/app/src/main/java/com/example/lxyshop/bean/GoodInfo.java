package com.example.lxyshop.bean;

import com.example.lxyshop.R;

import java.util.ArrayList;

public class GoodInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public String eva;
    public GoodInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        eva="";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "索菲", "妈妈棉服", "字母连帽", "派克棉服", "羊绒大衣", "法式小香衣","suk","派客服"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "羊绒女皮衣",
            "妈妈棉服加厚",
            "字母连帽加厚",
            "派克棉服潮流加厚",
            "纯羊毛大衣保暖",
            "小香衣内搭打底",
            "白色羽绒服",
            "女款冬季韩服"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {188,188, 288, 1188, 1288, 188,1128,188};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.yifu7, R.drawable.yifu8, R.drawable.yifu4,
            R.drawable.yifu2, R.drawable.yifu1, R.drawable.yifu6,R.drawable.yifu5,R.drawable.yifu3
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.yifu7, R.drawable.yifu8, R.drawable.yifu4,
            R.drawable.yifu2, R.drawable.yifu1, R.drawable.yifu6,R.drawable.yifu5,R.drawable.yifu3
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodInfo> getDefaultList() {
        ArrayList<GoodInfo> goodsList = new ArrayList<GoodInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodInfo info = new GoodInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

package com.example.goods.bean;

import com.example.goods.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "蔻一 Cnoles", "蔻一 Cnoles包包女包", " 蔻一 Cnoles 胸包女", "蔻一 Cnoles 包包", "蔻一(Cnoles)包包女包牛皮百搭单肩包", "蔻一 Cnoles 包包女包百搭OL","蔻一 Cnoles 包包女包牛皮单肩包","蔻一 Cnoles 包包女包欧美印花单肩斜挎包"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "包包女包牛皮百搭手提包通勤OL大容量单肩斜挎包托特包女款 C1039B酒红色",
            "女式单肩包女款大容量斜挎包女士包包小方包 B1182B酒红色",
            "牛皮潮流百搭女士单肩包链条腰包女休闲斜挎包 B1041B酒红色",
            "女包牛皮百搭单肩包女神韩版ins百褶风琴斜挎小方包 B986ED墨绿色",
            "女神韩版ins风琴斜挎小方包 B845B酒红色",
            "单肩手提包女士包包欧美斜挎包 B816A黑色",
            "女ck风时尚百搭撞色斜挎包个性手提包女士包包 C1188D米白色",
            "女式时尚百搭大容量水桶包女款 B772O灰色"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray ={240, 259, 268, 213, 259, 215,239,269};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aa, R.drawable.bb, R.drawable.cc,
            R.drawable.dd, R.drawable.ee, R.drawable.ff,R.drawable.gg,R.drawable.hh
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aas, R.drawable.bbs, R.drawable.ccs,
            R.drawable.dds, R.drawable.ees, R.drawable.ffs,R.drawable.ggs,R.drawable.hhs
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
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

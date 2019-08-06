package com.bawei.liyizhi0806.model.bean;

import java.util.List;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public class PersonBean {


    /**
     * code : 200
     * data : [{"name":"猪妹妹","type":1,"avatar":"http://blog.zhaoliang5156.cn/api/images/head_zhu_2019_08_01.jpeg","content":"学委哥哥，作业做好了吗？","images":[]},{"name":"孙哥哥","type":2,"avatar":"http://blog.zhaoliang5156.cn/api/images/head_sun_2019_08_01.jpg","content":"做好了","images":[]},{"name":"猪妹妹","type":1,"avatar":"http://blog.zhaoliang5156.cn/api/images/head_zhu_2019_08_01.jpeg","content":"借我看看呗","images":[]},{"name":"孙哥哥","type":2,"avatar":"http://blog.zhaoliang5156.cn/api/images/head_sun_2019_08_01.jpg","content":"先发过来你的一张照片","images":[]},{"name":"猪妹妹","type":3,"avatar":"http://blog.zhaoliang5156.cn/api/images/head_zhu_2019_08_01.jpeg","content":"","images":[{"imageurl":"http://blog.zhaoliang5156.cn/api/images/student_2019_08_01.jpg"}]}]
     */

    private String code;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * name : 猪妹妹
         * type : 1
         * avatar : http://blog.zhaoliang5156.cn/api/images/head_zhu_2019_08_01.jpeg
         * content : 学委哥哥，作业做好了吗？
         * images : []
         */

        private String name;
        private int type;
        private String avatar;
        private String content;
        private List<?> images;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }
    }
}

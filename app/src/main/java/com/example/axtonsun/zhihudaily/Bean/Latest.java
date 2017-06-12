package com.example.axtonsun.zhihudaily.Bean;

import java.util.List;

/**
 * Created by AxtonSun on 2016/11/29.
 */

public class Latest {

    /**
     * date : 20161129
     * stories : [{"images":["http://pic3.zhimg.com/7be1db98e8bf60d282a14f39b480fe0e.jpg"],"type":0,"id":9021233,"ga_prefix":"112919","title":"《西部世界》里的迷宫是什么？（有剧透）"},{"images":["http://pic4.zhimg.com/37add9d712372aaf2265b495f2d92b7f.jpg"],"type":0,"id":9020130,"ga_prefix":"112918","title":"AI 唇读术完虐行业专家，只看了 5000 小时的节目"},{"images":["http://pic4.zhimg.com/b39f8bfa10679a5beab462e3324b39ab.jpg"],"type":0,"id":9021919,"ga_prefix":"112917","title":"知乎好问题 · 怎样做春饼？"},{"images":["http://pic1.zhimg.com/12a14887f6bdbec87a4ae55dd07cf6b4.jpg"],"type":0,"id":9016836,"ga_prefix":"112916","title":"每天 5.5 元，照样吃得有营养"},{"images":["http://pic1.zhimg.com/50bf9a33dab76119b3db262d12a660dc.jpg"],"type":0,"id":9017092,"ga_prefix":"112915","title":"为什么我们会把婚姻当做爱情的坟墓？"},{"images":["http://pic3.zhimg.com/7b35831ef93222c95d13bd24d26fd23a.jpg"],"type":0,"id":9020893,"ga_prefix":"112914","title":"四大出身和企业会计出身，思维有什么差别？"},{"images":["http://pic3.zhimg.com/32ebfc815cf2c97959b0f9507323126e.jpg"],"type":0,"id":9021074,"ga_prefix":"112913","title":"上海房产新政出台，普通人买房的钱可能不够了"},{"images":["http://pic4.zhimg.com/c19d71adacaf059c7024bd19af308f67.jpg"],"type":0,"id":9018958,"ga_prefix":"112912","title":"大误 · 你好我是新来的物业"},{"title":"「为什么还要自己买？满大街的汽车你都能随便开嘛」","ga_prefix":"112911","images":["http://pic3.zhimg.com/3c33b341cca41a1498901cf6a3e6c84e.jpg"],"multipic":true,"type":0,"id":9018645},{"images":["http://pic2.zhimg.com/f17a9edeece808d3a629c0de09f94b55.jpg"],"type":0,"id":9018063,"ga_prefix":"112910","title":"我们会好奇「房子怎么不是圆的」，老祖宗应该很惊讶"},{"images":["http://pic4.zhimg.com/9d5a280a15b58bc86e72d859da30039f.jpg"],"type":0,"id":9019125,"ga_prefix":"112909","title":"是否应该取消对穷人的补贴和福利以激励他们上进？"},{"images":["http://pic2.zhimg.com/472f2b86db531b76fb35d5be913083ed.jpg"],"type":0,"id":9018860,"ga_prefix":"112908","title":"永远的 B 级片之王说，电影只有一种拍法"},{"images":["http://pic3.zhimg.com/da2b6357200627ffb3c79e166260eeca.jpg"],"type":0,"id":9018524,"ga_prefix":"112907","title":"人民币一路贬值，兑美元汇率会破 7 吗？"},{"images":["http://pic3.zhimg.com/5eb034baa432fb3d32a334ed057d986e.jpg"],"type":0,"id":9018874,"ga_prefix":"112907","title":"「网络版银联」要来了，会一统天下还是被边缘化？"},{"images":["http://pic1.zhimg.com/bfbe2644b181ec2086e1f06c7f0632f8.jpg"],"type":0,"id":9020194,"ga_prefix":"112907","title":"读读日报 24 小时热门 TOP 5 · 三步就能烤只鸡"},{"images":["http://pic2.zhimg.com/4c617ce5c4f8e8ba4a2d51482d4ef38d.jpg"],"type":0,"id":9018551,"ga_prefix":"112906","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic1.zhimg.com/9658b756df437ef083171909bbe71cd8.jpg","type":0,"id":9021919,"ga_prefix":"112917","title":"知乎好问题 · 怎样做春饼？"},{"image":"http://pic3.zhimg.com/c25c87dc429f8dc355ffb46d08b90e7a.jpg","type":0,"id":9016836,"ga_prefix":"112916","title":"每天 5.5 元，照样吃得有营养"},{"image":"http://pic1.zhimg.com/0f71f342c846010722aa01dfa17286f4.jpg","type":0,"id":9021074,"ga_prefix":"112913","title":"上海房产新政出台，普通人买房的钱可能不够了"},{"image":"http://pic3.zhimg.com/8b09ab18352fdd98ad72f5fd154ee09a.jpg","type":0,"id":9020194,"ga_prefix":"112907","title":"读读日报 24 小时热门 TOP 5 · 三步就能烤只鸡"},{"image":"http://pic2.zhimg.com/907d53fa67fdde52894fabe76140d965.jpg","type":0,"id":9018524,"ga_prefix":"112907","title":"人民币一路贬值，兑美元汇率会破 7 吗？"}]
     */

    private String date;
    private List<Stories> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Stories> getStories() {
        return stories;
    }

    public void setStories(List<Stories> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }


    public static class TopStoriesBean {
        /**
         * image : http://pic1.zhimg.com/9658b756df437ef083171909bbe71cd8.jpg
         * type : 0
         * id : 9021919
         * ga_prefix : 112917
         * title : 知乎好问题 · 怎样做春饼？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}

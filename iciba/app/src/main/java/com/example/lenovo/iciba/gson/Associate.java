package com.example.lenovo.iciba.gson;

import java.util.List;

public class Associate {


    /**
     * result : {"code":200,"msg":"success"}
     * data : {"query":"a","entries":[{"explain":"art. 一; 任一; 每一","entry":"a"},{"explain":"n. 账户; 解释; 账目，账单; 理由; vi. 解释; 导致; 报账; vt. 认为; 把\u2026视为","entry":"account"},{"explain":"adj. 有效的，可得的; 可利用的; 空闲的","entry":"available"},{"explain":"vt. 欣赏; 感激; 领会; 鉴别; vi. 增值; 涨价","entry":"appreciate"},{"explain":"vt. 使用; 存取; 接近; n. 进入; 使用权; 通路","entry":"access"},{"explain":"vt. 承担; 假定; 采取; 呈现; vi. 装腔作势; 多管闲事","entry":"assume"},{"explain":"adj. 适当的; vt. 占用; 拨出","entry":"appropriate"},{"explain":"vt. 演说; 从事; 忙于; 写姓名地址; n. 地址; 演讲; 致辞; 说话的技巧","entry":"address"},{"explain":"n. 方法; 途径; 接近; vt. 接近; 着手处理; vi. 靠近","entry":"approach"},{"explain":"adj. 供选择的; 选择性的; 交替的; n. 二中择一; 供替代的选择","entry":"alternative"},{"explain":"n. 发展; 前进; 增长; 预付款; vt. 提出; 预付; 使\u2026\u2026前进; 将\u2026\u2026提前; vi. ...","entry":"advance"},{"explain":"vi. 交往; 结交; n. 同事，伙伴; 关联的事物; vt. 联想; 使联合; 使发生联系; a...","entry":"associate"},{"explain":"vt. 申请; 涂，敷; 应用; vi. 申请; 涂，敷; 适用; 请求","entry":"apply"},{"explain":"vt. 影响; 感染; 感动; 假装; vi. 倾向; 喜欢; n. 情感; 引起感情的因素","entry":"affect"},{"explain":"n. 属性; 特质; vt. 归属; 把\u2026归于","entry":"attribute"},{"explain":"adj. 学术的; 理论的; 学院的; n. 大学生，大学教师; 学者","entry":"academic"},{"explain":"vt. 提倡，主张，拥护; n. 提倡者; 支持者; 律师","entry":"advocate"},{"explain":"vi. 呼吁，恳求; 上诉; 诉诸，求助; 有吸引力，迎合爱好; n. 呼吁，请求; 吸引力，感染力...","entry":"appeal"},{"explain":"conj. 因为; 随着; 虽然; 依照; prep. 如同; 当作; 以\u2026的身份; adv. 同样...","entry":"as"},{"explain":"n. 应用; 申请; 应用程序; 敷用","entry":"application"},{"explain":"n. 权威; 权力; 当局","entry":"authority"}],"language":"eng"}
     */

    private ResultBean result;
    private DataBean data;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ResultBean {
        /**
         * code : 200
         * msg : success
         */

        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class DataBean {
        /**
         * query : a
         * entries : [{"explain":"art. 一; 任一; 每一","entry":"a"},{"explain":"n. 账户; 解释; 账目，账单; 理由; vi. 解释; 导致; 报账; vt. 认为; 把\u2026视为","entry":"account"},{"explain":"adj. 有效的，可得的; 可利用的; 空闲的","entry":"available"},{"explain":"vt. 欣赏; 感激; 领会; 鉴别; vi. 增值; 涨价","entry":"appreciate"},{"explain":"vt. 使用; 存取; 接近; n. 进入; 使用权; 通路","entry":"access"},{"explain":"vt. 承担; 假定; 采取; 呈现; vi. 装腔作势; 多管闲事","entry":"assume"},{"explain":"adj. 适当的; vt. 占用; 拨出","entry":"appropriate"},{"explain":"vt. 演说; 从事; 忙于; 写姓名地址; n. 地址; 演讲; 致辞; 说话的技巧","entry":"address"},{"explain":"n. 方法; 途径; 接近; vt. 接近; 着手处理; vi. 靠近","entry":"approach"},{"explain":"adj. 供选择的; 选择性的; 交替的; n. 二中择一; 供替代的选择","entry":"alternative"},{"explain":"n. 发展; 前进; 增长; 预付款; vt. 提出; 预付; 使\u2026\u2026前进; 将\u2026\u2026提前; vi. ...","entry":"advance"},{"explain":"vi. 交往; 结交; n. 同事，伙伴; 关联的事物; vt. 联想; 使联合; 使发生联系; a...","entry":"associate"},{"explain":"vt. 申请; 涂，敷; 应用; vi. 申请; 涂，敷; 适用; 请求","entry":"apply"},{"explain":"vt. 影响; 感染; 感动; 假装; vi. 倾向; 喜欢; n. 情感; 引起感情的因素","entry":"affect"},{"explain":"n. 属性; 特质; vt. 归属; 把\u2026归于","entry":"attribute"},{"explain":"adj. 学术的; 理论的; 学院的; n. 大学生，大学教师; 学者","entry":"academic"},{"explain":"vt. 提倡，主张，拥护; n. 提倡者; 支持者; 律师","entry":"advocate"},{"explain":"vi. 呼吁，恳求; 上诉; 诉诸，求助; 有吸引力，迎合爱好; n. 呼吁，请求; 吸引力，感染力...","entry":"appeal"},{"explain":"conj. 因为; 随着; 虽然; 依照; prep. 如同; 当作; 以\u2026的身份; adv. 同样...","entry":"as"},{"explain":"n. 应用; 申请; 应用程序; 敷用","entry":"application"},{"explain":"n. 权威; 权力; 当局","entry":"authority"}]
         * language : eng
         */

        private String query;
        private String language;
        private List<EntriesBean> entries;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public List<EntriesBean> getEntries() {
            return entries;
        }

        public void setEntries(List<EntriesBean> entries) {
            this.entries = entries;
        }

        public static class EntriesBean {
            /**
             * explain : art. 一; 任一; 每一
             * entry : a
             */

            private String explain;
            private String entry;

            public String getExplain() {
                return explain;
            }

            public void setExplain(String explain) {
                this.explain = explain;
            }

            public String getEntry() {
                return entry;
            }

            public void setEntry(String entry) {
                this.entry = entry;
            }
        }
    }
}

const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmb471b/",
            name: "ssmb471b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmb471b/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小型超市管理系统"
        } 
    }
}
export default base

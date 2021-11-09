/* 	Webpage interface :
constructor(theme)
getContent()	*/
class About{ 
    constructor(theme) {
        this.theme = theme
    }
    getContent() {
        return "About page in " + this.theme.getColor()
    }
}
class Careers{
   constructor(theme) {
       this.theme = theme
   } 
   getContent() {
       return "Careers page in " + this.theme.getColor()
   } 
}

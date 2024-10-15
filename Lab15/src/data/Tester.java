/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import lab15.Colony;
import lab15.FPTUniversity;
import lab15.Role;
import lab15.University;
import lab15.beeColony;

/**
 *
 * @author PC
 */
public class Tester {
    public static void main(String[] args) {
        Colony obj1=new beeColony("honey", "land", 2000);
 System.out.println(obj1);
 obj1.grow();
 obj1. reproduce();
 University obj2=new FPTUniversity("CANTHO", "FPT", 100000);
 System.out.println(obj2);
 obj2.enroll();
 obj2.educate();

 Role df= new beeColony("wasp", "land", 3000);
 System.out.println(df);
 df.createWorker();

 df= new FPTUniversity("hanoi", "fpt", 100000);
 System.out.println(df);
 df. createWorker ();
    }
}
//khai cha new con, con vượt mặt cha, lấy danh cha để GÁY nhưng thực sự là con, "MÀY BIẾT BỐ MÀY LÀ AI KHÔNGGG", con lấy nhiều chức vụ, DANH XƯNG 
// =>POLY
// tóm gọn lại : trong stack sẽ lưu trữ các POITER VARIABLE  trỏ đến , sờ đến , chỉ đến ,tham chiếu đến, CHỔ NÀY NÀY  vd : parent p = new child();
// chổ lưu trữ mình new các object trong BỘ NHỚ HEAP
//Organization là  abstrac class bởi vì xem như orgnalaf  một câu lạc bộ  cùng chung ý tưởng chung hành động, cùng bản chất 
// mày tham gia vào đây tao cho mày 1 lí tưởng, ý tưởng, skill còn việc muốn phát triển cái đó như sao thì kệ.
// interface và abstrac class khác nhau  interface khác bản chất nhưng cùng hành động .
//khi mình đã cho cái comicationByTool mình phải implement nó trừ khi xóa đi abstrac của phương thức đó, đảm bảo tính đa hình 
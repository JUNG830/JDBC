import DAO.menuDAO;
import DAO.optionDAO;
import DAO.orderDAO;
import DAO.seqOrderNoDAO;
import VO.MenuInfoVO;
import VO.optionVO;
import VO.orderVO;
import VO.seqOrderNoVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coffeeMain {
    public static void main(String[] args) {
            menuSelect();
        }

        public static void menuSelect() {
            Scanner sc = new Scanner(System.in);
            menuDAO dao = new menuDAO();
            optionDAO opDAO = new optionDAO();
            orderDAO odDAO = new orderDAO();
            seqOrderNoDAO seqodDAO = new seqOrderNoDAO();
            while (true) {
                System.out.println("===== [MENU] =====");
                        List<MenuInfoVO> list = dao.menuSelect();
                        dao.menuSelectRst(list);
                        System.out.println();
                        System.out.print("메뉴를 입력하세요[번호를 입력] : ");
                        int mno = sc.nextInt();

                        List<optionVO> oplist = opDAO.optionSelect(mno);
                        opDAO.optionSelectRst(oplist);
                        System.out.println();
                        while (true) {
                            System.out.println("옵션을 선택해주세요 [001]/[002]/[003]/[999 : 선택완료] : ");
                            String OrderNo = sc.next();
                            if (OrderNo.equals("999")) {
                                System.out.println("선택완료");
                                break;
                            }
                        } return;




                }
            }
        }



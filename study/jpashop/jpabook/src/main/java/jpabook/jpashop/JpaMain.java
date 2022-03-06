package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); // 딱 하나만 존재해야됨.

        EntityManager em = emf.createEntityManager(); // transaction 하나 실행될 때 이게 필요함 고객의 요청이 올때마다, 쓰레드간에 공유를 하면 안됨.
        //code 여기서 부터 db에 저장하거나 가져오는 코드 시작

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
//
            tx.commit();
        }catch (Exception e){
            tx.rollback();;
        } finally {
            em.close();
        }



        emf.close();
    }
}

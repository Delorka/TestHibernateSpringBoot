package com.larisasviridova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    //HandlerMapping — интерфейс, который реализуется объектами
    // , которые определяют отображение между запросами и объектами обработчиков.
    @RequestMapping("/")
    public ModelAndView welcome(ModelAndView model){
        model.setViewName("index");

        /*Session session = null;
        Transaction transaction = null;
        ArrayList<String> resSet = null;
        String [][] allSet = null;
        List<?> list = null;

        try {
                session = HibernateSession.getSessionFactory().openSession();
                transaction = session.beginTransaction();

                //TestEntity testEntity = new TestEntity();

               //testEntity.setPassword("1l");
               //testEntity.setName("Sunil");
               //session.save(testEntity);

               //testEntity.setCode(11);
               //session.delete(testEntity);

               //testEntity.setCode(12);
               //testEntity.setName("Name1");
               //testEntity.setPassword("Password1");
               //session.update(testEntity);

                Query query = session.createQuery("from TestEntity where name =:name ")
                        .setParameter("name", "Name1");

                list = query.list();

                resSet = new ArrayList();
                for (int i=0;i<list.size();i++) {
                    resSet.add( ((TestEntity) list.get(i)).getPassword());
                }

                allSet = new String [list.size()][3];
                for (int j=0;j<list.size();j++) {
                    allSet [j][0] = String.valueOf(((TestEntity) list.get(j)).getCode());
                    allSet [j][1] = ((TestEntity) list.get(j)).getName();
                    allSet [j][2] = ((TestEntity) list.get(j)).getPassword();
                }

               // people = (List<TestEntity>) testEntityRepository.findAll();
               //people = (List<TestEntity>) testEntityRepository.findByName("Name1");

                    transaction.commit();

            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            } finally {
                if (session != null) {
                    session.close();
                    HibernateSession.shutdown(); //
                }
            }
            //HibernateSession.shutdown();
        model.addObject("resSet",resSet);
        model.addObject("allSet",allSet);
        model.addObject("list",list);*/

        //List <TestEntity> people = userService.getByName("1");

        /*TestEntity testEntity = new TestEntity();
        testEntity.setName("Name3");
        testEntity.setPassword("Password4");
        userService.addTestEntity(testEntity);*/

        /*TestEntity testEntity = new TestEntity();
        List <TestEntity> people = userService.getByNameLike("Name3");
        testEntity = people.get(0);
        userService.delete(testEntity);*/

        /*TestEntity testEntity = new TestEntity();
        List <TestEntity> people = userService.getByName("Ура!");
        testEntity = people.get(0);
        userService.flush();*/

        /*TestEntity testEntity = new TestEntity();
        testEntity = userService.findByCode(2);
        testEntity.setName("Ура!!!!!!!!!!!!!");
        userService.flush();*/

        List <TestEntity> people = userService.getByNameLike("111");
        model.addObject("people",people);
        return model;
    }

}

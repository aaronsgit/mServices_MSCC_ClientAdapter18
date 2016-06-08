package solutions.legatus.mservice.mscc.client.Bean.impl;


import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccBeanFactory;

/**
 * Created by ahou on 1/28/2016.
 */

public class MsccBeanFactory extends AbstractMsccBeanFactory {

        private static MsccBeanFactory _instance_;

        private MsccBeanFactory() {
        }


        public static MsccBeanFactory getInstance() {
            if( _instance_ == null ) {

                synchronized ( MsccBeanFactory.class ) {
                    if( _instance_ == null ) {
                        _instance_ = new MsccBeanFactory();
                    }
                }

            }

            return _instance_;


        }


        public MsccBean.Collection createColletionDTO( ) {

            return MsccBean.Collection.getBuilder().build();
        }



        public MsccBean.Organization createOrganizationBean( ) {

            return MsccBean.Organization.getBuilder().build();
        }


        public MsccBean.Organization.ID createOrganizationBeanID( String ID ) {

            return new MsccBean.Organization.ID( ID );
        }


        public MsccBean.Organization.ID createOrganizationBeanID( MsccBean.Organization bean ) {

            return new MsccBean.Organization.ID( bean.getID().getOrganizationID() );
        }




        public MsccBean.Office createOfficeBean( ) {

            return MsccBean.Office.getBuilder().build();
        }


        public MsccBean.Office.ID createOfficeBeanID( String Organaniztion,  String office ) {

            return new MsccBean.Office.ID( Organaniztion, office );
        }


        public MsccBean.Office.ID createOfficeBeanID( MsccBean.Office bean ) {

            return new MsccBean.Office.ID( bean.getID().getOrganizationID(), bean.getID().getOfficeID() );
        }



        public MsccBean.User createUserBean( ) {

            return MsccBean.User.getBuilder().build();
        }


        public MsccBean.User.ID createUserBeanID( String Organaniztion,  String user ) {

            return new MsccBean.User.ID( Organaniztion,  user );
        }


        public MsccBean.User.ID createUserBeanID( MsccBean.User bean ) {

            return new MsccBean.User.ID( bean.getID().getOrganizationID(), bean.getID().getUserID() );
        }


        public MsccBean.UserOffice createUserOfficeBean( ) {

            return MsccBean.UserOffice.getBuilder().build();
        }


        public MsccBean.UserOffice.ID createUserOfficeBeanID( String Organaniztion,  String office, String user ) {

            return new MsccBean.UserOffice.ID( Organaniztion, office, user );
        }


        public MsccBean.UserOffice.ID createUserOfficeBeanID( MsccBean.UserOffice bean ) {

            return new MsccBean.UserOffice.ID( bean.getID().getOrganizationID(), bean.getID().getOfficeID(), bean.getID().getUserID() );
        }



}

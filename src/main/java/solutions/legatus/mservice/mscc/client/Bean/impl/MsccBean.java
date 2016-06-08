package solutions.legatus.mservice.mscc.client.Bean.impl;

import solutions.legatus.mservice.mscc.client.Bean.*;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by ahou on 1/28/2016.
 */
public class MsccBean implements IMsccBean {


    public final static class Collection extends AbstractMsccEntity {
        private String  OrganizationID;

        private String  OfficeID;

        private String  UserID;

        private String  RefNbrID;

        private String Account;

        private String SubAccount;

        private String DialogType;

        private String DialogShare;

        private String Folder;

        private Timestamp HalfalogueStartTs;

        private Timestamp ObsoletionTs;

        private String OrganizationCreator;

        private String OfficeCreator;

        private String UserCreator;

        private String UserCreatorEmail;

        private String UserCreatorTelephone;


        private String  OrganizationRqst;

        private String  OfficeRqst;

        private String  UserRqst;

        private String  RefNbrIDRqst;


        public Collection() {
        }

        private Collection( Builder builder ) {
            this.OrganizationID = builder.OrganizationID;
            this.OfficeID = builder.OfficeID;
            this.UserID = builder.UserID;
            this.RefNbrID = builder.RefNbrID;
            this.Account = builder.Account;
            this.SubAccount = builder.SubAccount;
            this.DialogType = builder.DialogType;
            this.DialogShare = builder.DialogShare;
            this.Folder = builder.Folder;
            this.HalfalogueStartTs = builder.HalfalogueStartTs;
            this.ObsoletionTs = builder.ObsoletionTs;
            this.OrganizationCreator = builder.OrganizationCreator;
            this.OfficeCreator = builder.OfficeCreator;
            this.UserCreator = builder.UserCreator;
            this.UserCreatorEmail = builder.UserCreatorEmail;
            this.UserCreatorTelephone = builder.UserCreatorTelephone;
            this.OrganizationRqst = builder.OrganizationRqst;
            this.OfficeRqst = builder.OfficeRqst;
            this.UserRqst = builder.UserRqst;
            this.RefNbrIDRqst = builder.RefNbrIDRqst;
        }

        public String getOrganizationID() {
            return OrganizationID;
        }

        public void setOrganizationID(String organizationID) {
            OrganizationID = organizationID;
        }

        public String getOfficeID() {
            return OfficeID;
        }

        public void setOfficeID(String officeID) {
            OfficeID = officeID;
        }

        public String getUserID() {
            return UserID;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public String getRefNbrID() {
            return RefNbrID;
        }

        public void setRefNbrID(String refNbrID) {
            RefNbrID = refNbrID;
        }


        public String getAccount() {
            return Account;
        }

        public void setAccount(String account) {
            Account = account;
        }

        public String getSubAccount() {
            return SubAccount;
        }

        public void setSubAccount(String subAccount) {
            SubAccount = subAccount;
        }

        public String getDialogType() {
            return DialogType;
        }

        public void setDialogType(String dialogType) {
            DialogType = dialogType;
        }

        public String getDialogShare() {
            return DialogShare;
        }

        public void setDialogShare(String dialogShare) {
            DialogShare = dialogShare;
        }

        public String getFolder() {
            return Folder;
        }

        public void setFolder(String folder) {
            Folder = folder;
        }

        public Timestamp getHalfalogueStartTs() {
            return HalfalogueStartTs;
        }

        public void setHalfalogueStartTs(Timestamp halfalogueStartTs) {
            HalfalogueStartTs = halfalogueStartTs;
        }

        public Timestamp getObsoletionTs() {
            return ObsoletionTs;
        }

        public void setObsoletionTs(Timestamp obsoletionTs) {
            ObsoletionTs = obsoletionTs;
        }

        public String getOrganizationCreator() {
            return OrganizationCreator;
        }

        public void setOrganizationCreator(String organizationCreator) {
            OrganizationCreator = organizationCreator;
        }

        public String getOfficeCreator() {
            return OfficeCreator;
        }

        public void setOfficeCreator(String officeCreator) {
            OfficeCreator = officeCreator;
        }

        public String getUserCreator() {
            return UserCreator;
        }

        public void setUserCreator(String userCreator) {
            UserCreator = userCreator;
        }

        public String getUserCreatorEmail() {
            return UserCreatorEmail;
        }

        public void setUserCreatorEmail(String userCreatorEmail) {
            UserCreatorEmail = userCreatorEmail;
        }

        public String getUserCreatorTelephone() {
            return UserCreatorTelephone;
        }

        public void setUserCreatorTelephone(String userCreatorTelephone) {
            UserCreatorTelephone = userCreatorTelephone;
        }

        public String getOrganizationRqst() {
            return OrganizationRqst;
        }

        public void setOrganizationRqst(String organizationRqst) {
            OrganizationRqst = organizationRqst;
        }

        public String getOfficeRqst() {
            return OfficeRqst;
        }

        public void setOfficeRqst(String officeRqst) {
            OfficeRqst = officeRqst;
        }

        public String getUserRqst() {
            return UserRqst;
        }

        public void setUserRqst(String userRqst) {
            UserRqst = userRqst;
        }

        public String getRefNbrIDRqst() {
            return RefNbrIDRqst;
        }

        public void setRefNbrIDRqst(String refNbrIDRqst) {
            RefNbrIDRqst = refNbrIDRqst;
        }


        public static Builder getBuilder() {
            return new Builder();
        }


        public static class Builder {
            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;

            private String Account;
            private String SubAccount;
            private String DialogType;
            private String DialogShare;
            private String Folder;
            private Timestamp HalfalogueStartTs;
            private Timestamp ObsoletionTs;
            private String OrganizationCreator;
            private String OfficeCreator;
            private String UserCreator;
            private String UserCreatorEmail;
            private String UserCreatorTelephone;

            private String  OrganizationRqst;
            private String  OfficeRqst;
            private String  UserRqst;
            private String  RefNbrIDRqst;


            private Builder() {}

            public Builder OrganizationID( String OrganizationID) {
                this.OrganizationID = OrganizationID;
                return this;
            }
            public Builder OfficeID( String OfficeID) {
                this.OfficeID = OfficeID;
                return  this;

            }

            public Builder UserID( String UserID) {
                this.UserID = UserID;
                return  this;

            }

            public Builder RefNbrID( String RefNbrID) {
                this.RefNbrID = RefNbrID;
                return  this;
            }

            public Builder Account( String Account) {
                this.Account = Account;
                return  this;
            }
            public Builder SubAccount( String SubAccount) {
                this.SubAccount = SubAccount;
                return  this;
            }
            public Builder DialogType( String DialogType) {
                this.DialogType = DialogType;
                return  this;
            }
            public Builder DialogShare( String DialogShare) {
                this.DialogShare = DialogShare;
                return  this;
            }
            public Builder Folder( String Folder) {
                this.Folder = Folder;
                return  this;
            }
            public Builder HalfalogueStartTs( Timestamp HalfalogueStartTs) {
                this.HalfalogueStartTs = HalfalogueStartTs;
                return  this;
            }
            public Builder ObsoletionTs( Timestamp ObsoletionTs) {
                this.ObsoletionTs = ObsoletionTs;
                return  this;
            }
            public Builder OrganizationCreator( String OrganizationCreator) {
                this.OrganizationCreator = OrganizationCreator;
                return  this;
            }
            public Builder OfficeCreator( String OfficeCreator) {
                this.OfficeCreator = OfficeCreator;
                return  this;
            }
            public Builder UserCreator( String UserCreator) {
                this.UserCreator = UserCreator;
                return  this;
            }
            public Builder UserCreatorEmail( String UserCreatorEmail) {
                this.UserCreatorEmail = UserCreatorEmail;
                return  this;
            }
            public Builder UserCreatorTelephone( String UserCreatorTelephone) {
                this.UserCreatorTelephone = UserCreatorTelephone;
                return  this;
            }
            public Builder OrganizationRqst( String OrganizationRqst) {
                this.OrganizationRqst = OrganizationRqst;
                return  this;
            }
            public Builder OfficeRqst( String OfficeRqst) {
                this.OfficeRqst = OfficeRqst;
                return  this;
            }
            public Builder UserRqst( String UserRqst) {
                this.UserRqst = UserRqst;
                return  this;
            }
            public Builder RefNbrIDRqst( String RefNbrIDRqst) {
                this.RefNbrIDRqst = RefNbrIDRqst;
                return  this;
            }


            public Collection build() {
                Collection collection = new Collection( this );
                return collection;
            }

        }

        public static class ID {
            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;
            private String  RefNbrID;

            public ID(String organizationID, String officeID, String userID, String refNbrID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
                RefNbrID = refNbrID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }

            public String getRefNbrID() {
                return RefNbrID;
            }

            public void setRefNbrID(String refNbrID) {
                RefNbrID = refNbrID;
            }
        }

        public ID getID() {

            return new ID(  getOrganizationID(), getOfficeID(), getUserID(), getRefNbrID() );
        }

        @Override
        public String toString() {
            return "MsccCollection{" +
                    "OrganizationID='" + OrganizationID + '\'' +
                    ", OfficeID='" + OfficeID + '\'' +
                    ", UserID='" + UserID + '\'' +
                    ", RefNbrID='" + RefNbrID + '\'' +
                    ", Account='" + Account + '\'' +
                    ", SubAccount='" + SubAccount + '\'' +
                    ", DialogType='" + DialogType + '\'' +
                    ", DialogShare='" + DialogShare + '\'' +
                    ", Folder='" + Folder + '\'' +
                    ", HalfalogueStartTs=" + HalfalogueStartTs +
                    ", ObsoletionTs=" + ObsoletionTs +
                    ", OrganizationCreator='" + OrganizationCreator + '\'' +
                    ", OfficeCreator='" + OfficeCreator + '\'' +
                    ", UserCreator='" + UserCreator + '\'' +
                    ", UserCreatorEmail='" + UserCreatorEmail + '\'' +
                    ", UserCreatorTelephone='" + UserCreatorTelephone + '\'' +
                    ", OrganizationRqst='" + OrganizationRqst + '\'' +
                    ", OfficeRqst='" + OfficeRqst + '\'' +
                    ", UserRqst='" + UserRqst + '\'' +
                    ", RefNbrIDRqst='" + RefNbrIDRqst + '\'' +
                    '}';
        }



    }

    public final static class Organization extends AbstractMsccEntity {

        private ID ID;
        private String Country;
        private String GovLevel;
        private String Name;
        private String Type;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;

        public Organization() {
        }

        public ID getID() {
            return ID;
        }

        public void setID(ID id) {
            this.ID = id;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String Country) {
            this.Country = Country;
        }

        public String getGovLevel() {
            return this.GovLevel;
        }

        public void setGovLevel(String GovLevel) {
            this.GovLevel = GovLevel;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }

        public void setCreatedTs( Timestamp CreatedTs) {
            this.CreatedTs = CreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }

        public void setDeactivatedTs( Timestamp DeactivatedTs) {
            this.DeactivatedTs = DeactivatedTs;
        }


        private Organization( Builder builder ) {
            this.ID             = builder.ID;
            this.Country        = builder.Country;
            this.GovLevel       = builder.GovLevel;
            this.Name           = builder.Name;
            this.Type           = builder.Type;
            this.CreatedTs      = builder.CreatedTs;
            this.DeactivatedTs  = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public void update( MsccBean.Organization bean ) {
            Optional.of( bean ).ifPresent(
                    x ->  {
                        this.update( x.getCountry() , x.getGovLevel(), x.getName(), x.getType(), x.getCreatedTs(),  x.getDeactivatedTs() );
                    } );
        }

        public void update( String Country, String GovLevel, String Name, String Type, Timestamp CreatedTs, Timestamp DeactivatedTs ) {
            Optional.ofNullable(  Country ).ifPresent(       (x) -> this.setCountry( x ) );
            Optional.ofNullable(  GovLevel ).ifPresent(      (x) -> this.setGovLevel( x ) );
            Optional.ofNullable(  Name ).ifPresent(          (x) -> this.setName( x ) );
            Optional.ofNullable(  Type ).ifPresent(          (x) -> this.setType( x ) );
            Optional.ofNullable(  CreatedTs ).ifPresent(     (x) -> this.setCreatedTs( x ) );
            Optional.ofNullable(  DeactivatedTs ).ifPresent( (x) -> this.setDeactivatedTs( x ) );
        }

        @Override
        public String toString() {
            return "Organization{" +
                    "OrganizationID='" + ID + '\'' +
                    ", OrganizationCountry='" + Country + '\'' +
                    ", OrganizationGovLevel='" + GovLevel + '\'' +
                    ", OrganizationName='" + Name + '\'' +
                    ", OrganizationType='" + Type + '\'' +
                    ", OrganizationCreatedTs=" + CreatedTs +
                    ", OrganizationDeactivatedTs=" + DeactivatedTs +
                    '}';
        }


        public static class Builder {

            private ID ID;
            private String Country;
            private String GovLevel;
            private String Name;
            private String Type;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;


            private Builder() {}

            public Builder ID( ID OrganizationID) {
                this.ID = OrganizationID;
                return this;
            }
            public Builder Country( String Country ) {
                this.Country = Country;
                return this;
            }
            public Builder GovLevel( String GovLevel ) {
                this.GovLevel = GovLevel;
                return this;
            }
            public Builder Name( String Name ) {
                this.Name = Name;
                return this;
            }
            public Builder Type( String Type ) {
                this.Type = Type;
                return this;
            }
            public Builder CreatedTs( Timestamp CreatedTs ) {
                this.CreatedTs = CreatedTs;
                return this;
            }
            public Builder DeactivatedTs( Timestamp DeactivatedTs ) {
                this.DeactivatedTs = DeactivatedTs;
                return this;
            }

            public Organization build() {
                Organization organization = new Organization( this );

                return organization;
            }

        }

        public static class ID extends AbstractMsccEntityID {

            private String OrganizationID;

            public ID() {
            }

            public ID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOrganizationID() {
                return this.OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                this.OrganizationID = organizationID;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return Objects.equals(OrganizationID, id.OrganizationID);
            }

            @Override
            public int hashCode() {
                return Objects.hash(OrganizationID);
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        '}';
            }
        }


    }

    public final static class Office extends AbstractMsccEntity {

        private MsccBean.Office.ID ID;
        private String Address1;
        private String Address2;
        private String City;
        private String Jurisdiction;
        private String MainTele;
        private String Desc;
        private String Postal;
        private String Website;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;


        public Office() {
        }

        private Office( Builder builder ) {
            this.ID                 = builder.ID;
            this.Address1           = builder.Address1;
            this.Address2           = builder.Address2;
            this.City               = builder.City;
            this.Jurisdiction       = builder.Jurisdiction;
            this.MainTele           = builder.MainTele;
            this.Desc               = builder.Desc;
            this.Postal             = builder.Postal;
            this.Website            = builder.Website;
            this.CreatedTs          = builder.CreatedTs;
            this.DeactivatedTs      = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }

        public Office.ID getID() {
            return ID;
        }

        public void setID(Office.ID ID) {
            this.ID = ID;
        }

        public String getAddress1() {
            return Address1;
        }

        public void setAddress1(String address1) {
            Address1 = address1;
        }

        public String getAddress2() {
            return Address2;
        }

        public void setAddress2(String address2) {
            Address2 = address2;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getJurisdiction() {
            return Jurisdiction;
        }

        public void setJurisdiction(String jurisdiction) {
            Jurisdiction = jurisdiction;
        }

        public String getMainTele() {
            return MainTele;
        }

        public void setMainTele(String mainTele) {
            MainTele = mainTele;
        }

        public String getDesc() {
            return Desc;
        }

        public void setDesc(String Desc) {
            this.Desc = Desc;
        }

        public String getPostal() {
            return Postal;
        }

        public void setPostal(String postal) {
            Postal = postal;
        }

        public String getWebsite() {
            return Website;
        }

        public void setWebsite(String website) {
            Website = website;
        }

        public Timestamp getCreatedTs() {
            return CreatedTs;
        }

        public void setCreatedTs(Timestamp CreatedTs) {
            CreatedTs = CreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }

        public void setDeactivatedTs(Timestamp DeactivatedTs) {
            DeactivatedTs = DeactivatedTs;
        }

        @Override
        public String toString() {
            return "Office{" +
                    "ID=" + ID +
                    ", Address1='" + Address1 + '\'' +
                    ", Address2='" + Address2 + '\'' +
                    ", City='" + City + '\'' +
                    ", Jurisdiction='" + Jurisdiction + '\'' +
                    ", MainTele='" + MainTele + '\'' +
                    ", Desc='" + Desc + '\'' +
                    ", Postal='" + Postal + '\'' +
                    ", Website='" + Website + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }

        public void update( MsccBean.Office model ) {

            Optional.of( model ).ifPresent(
                    x ->  {
                        update( x.getAddress1() , x.getAddress2(), x.getCity(), x.getJurisdiction(), x.getMainTele(), x.getDesc(), x.getPostal(), x.getWebsite(), x.getCreatedTs(),  x.getDeactivatedTs() );
                    } );

        }

        public void update( String Address1, String Address2, String City, String Jurisdiction, String MainTele, String Desc, String Postal, String Website, Timestamp CreatedTs, Timestamp DeactivatedTs  ) {

            Optional.ofNullable( Address1 ).ifPresent(x -> setAddress1( x ) );
            Optional.ofNullable( Address2 ).ifPresent( x -> setAddress2( x ) );
            Optional.ofNullable( City ).ifPresent( x -> setCity( x ) );
            Optional.ofNullable( Jurisdiction ).ifPresent( x -> setJurisdiction( x ) );
            Optional.ofNullable( MainTele ).ifPresent( x -> setMainTele( x ) );
            Optional.ofNullable( Desc ).ifPresent( x -> setDesc( x ) );
            Optional.ofNullable( Postal ).ifPresent( x ->setPostal( x ) );
            Optional.ofNullable( Website ).ifPresent( x -> setWebsite( x ) );
            Optional.ofNullable( CreatedTs ).ifPresent( x -> setCreatedTs( x ) );
            Optional.ofNullable( DeactivatedTs ).ifPresent( x ->setDeactivatedTs( x ));

        }


        public static class Builder  {

            private ID ID;
            private String Address1;
            private String Address2;
            private String City;
            private String Jurisdiction;
            private String MainTele;
            private String Desc;
            private String Postal;
            private String Website;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}

            public Builder ID(ID id) {
                this.ID = id;
                return  this;
            }
            public Builder Address1(String Address1 ) {
                this.Address1 = Address1;
                return this;
            }
            public Builder Address2( String Address2 ) {
                this.Address2 = Address2;
                return this;
            }
            public Builder City( String City ) {
                this.City = City;
                return this;
            }
            public Builder Jurisdiction( String JurisDiction ) {
                this.Jurisdiction = JurisDiction;
                return this;
            }
            public Builder MainTele( String MainTele ) {
                this.MainTele = MainTele;
                return this;
            }
            public Builder Desc( String Desc ) {
                this.Desc = Desc;
                return this;
            }
            public Builder Postal( String Postal ) {
                this.Postal = Postal;
                return this;

            }
            public Builder Website( String Website ) {
                this.Website = Website;
                return this;
            }

            public Builder CreatedTs( Timestamp CreatedTs ) {
                this.CreatedTs = CreatedTs;
                return this;
            }
            public Builder DeactivatedTs( Timestamp DeactivatedTs ) {
                this.DeactivatedTs  = DeactivatedTs;
                return this;

            }

            public Office build() {
                Office office = new Office( this );
                return office;
            }

        }


        public static class ID extends AbstractMsccEntityID {

            private String OrganizationID;

            private String OfficeID;

            public ID() {
            }

            public ID(String organizationID, String officeID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                this.OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                this.OfficeID = officeID;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return Objects.equals(OrganizationID, id.OrganizationID) &&
                        Objects.equals(OfficeID, id.OfficeID);
            }

            @Override
            public int hashCode() {
                return Objects.hash(OrganizationID, OfficeID);
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        '}';
            }
        }

    }

    public final static class User extends AbstractMsccEntity {

        private MsccBean.User.ID ID;

        private String Name;
        private String PersonalTitle;
        private String TeleDaytime;
        private String TeleOffhours;
        private String Timezone;
        private String Title;
        private String Credential;
        private String Email;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;

        public User() {
        }

        private User( Builder builder ) {
            this.ID = builder.ID;
            this.Name = builder.Name;
            this.PersonalTitle = builder.PersonalTitle;
            this.TeleDaytime = builder.TeleDaytime;
            this.TeleOffhours = builder.TeleOffhours;
            this.Timezone = builder.Timezone;
            this.Title = builder.Title;
            this.Credential = builder.Credential;
            this.Email = builder.Email;
            this.CreatedTs = builder.CreatedTs;
            this.DeactivatedTs = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }


        public User.ID getID() {
            return ID;
        }

        public void setID(User.ID ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String userName) {
            this.Name = userName;
        }

        public String getPersonalTitle() {
            return PersonalTitle;
        }

        public void setPersonalTitle(String personalTitle) {
            this.PersonalTitle = personalTitle;
        }

        public String getTeleDaytime() {
            return TeleDaytime;
        }

        public void setTeleDaytime(String teleDaytime) {
            this.TeleDaytime = teleDaytime;
        }

        public String getTeleOffhours() {
            return TeleOffhours;
        }

        public void setTeleOffhours(String teleOffhours) {
            this.TeleOffhours = teleOffhours;
        }

        public String getTimezone() {
            return Timezone;
        }

        public void setTimezone(String timezone) {
            Timezone = timezone;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getCredential() {
            return Credential;
        }

        public void setCredential(String Credential) {
            this.Credential = Credential;
        }

        public String getEmail() {
            return this.Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public Timestamp getCreatedTs() {
            return this.CreatedTs;
        }

        public void setCreatedTs(Timestamp CreatedTs) {
            this.CreatedTs = CreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return this.DeactivatedTs;
        }

        public void setDeactivatedTs(Timestamp DeactivatedTs) {
            this.DeactivatedTs = DeactivatedTs;
        }

        public void update( MsccBean.User bean ) {
            Optional.of( bean ).ifPresent(
                    x ->  {
                        this.update( x.getName() , x.getPersonalTitle(), x.getTeleDaytime(), x.getTeleOffhours(), x.getTimezone(), x.getTitle(), x.getCredential(), x.getEmail(), x.getCreatedTs(),  x.getDeactivatedTs() );
                    } );
        }

        public void update( String userName, String PersonalTitle, String TeleDaytime, String TeleOffhours, String Timezone, String Title, String Credential, String Email, Timestamp CreatedTs, Timestamp DeactivatedTs ) {


            Optional.ofNullable( userName ).ifPresent(            (x) -> this.setName( x ) );
            Optional.ofNullable( PersonalTitle ).ifPresent(       (x) -> this.setPersonalTitle( x ) );
            Optional.ofNullable( TeleDaytime).ifPresent(            (x) -> this.setTeleDaytime( x ) );
            Optional.ofNullable( TeleOffhours ).ifPresent(         (x) -> this.setTeleOffhours( x ) );
            Optional.ofNullable( Timezone  ).ifPresent(            (x) -> this.setTimezone( x ) );
            Optional.ofNullable( Title ).ifPresent(                (x) -> this.setTitle( x ) );
            Optional.ofNullable( Credential  ).ifPresent(      (x) -> this.setCredential( x ) );
            Optional.ofNullable( Email ).ifPresent(      (x) -> this.setEmail( x ) );
            Optional.ofNullable( CreatedTs ).ifPresent(     (x) -> this.setCreatedTs( x ) );
            Optional.ofNullable( DeactivatedTs ).ifPresent( (x) -> this.setDeactivatedTs( x ) );

        }


        @Override
        public String toString() {
            return "User{" +
                    "ID=" + ID +
                    ", Name='" + Name + '\'' +
                    ", PersonalTitle='" + PersonalTitle + '\'' +
                    ", TeleDaytime='" + TeleDaytime + '\'' +
                    ", TeleOffhours='" + TeleOffhours + '\'' +
                    ", Timezone='" + Timezone + '\'' +
                    ", Title='" + Title + '\'' +
                    ", Credential='" + Credential + '\'' +
                    ", Email='" + Email + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }

        public static class Builder {

            private ID ID;
            private String Name;
            private String PersonalTitle;
            private String TeleDaytime;
            private String TeleOffhours;
            private String Timezone;
            private String Title;
            private String Credential;
            private String Email;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;

            private Builder() {}


            public Builder ID( ID Id ) {
                this.ID = Id;
                return  this;
            }


            public Builder Name(String UserName) {
                this.Name = UserName;
                return  this;
            }
            public Builder PersonalTitle( String PersonalTitle) {
                this.PersonalTitle = PersonalTitle;
                return  this;
            }
            public Builder TeleDaytime( String TeleDaytime) {
                this.TeleDaytime = TeleDaytime;
                return  this;
            }
            public Builder TeleOffhours( String TeleOffhours) {
                this.TeleOffhours = TeleOffhours;
                return  this;
            }
            public Builder Timezone( String Timezone) {
                this.Timezone = Timezone;
                return  this;
            }
            public Builder Title( String Title) {
                this.Title = Title;
                return  this;
            }
            public Builder Credential( String UserCredential) {
                this.Credential = UserCredential;
                return  this;
            }
            public Builder Email( String UserEmail) {
                this.Email = UserEmail;
                return  this;
            }
            public Builder CreatedTs( Timestamp UserCreatedTs ) {
                this.CreatedTs = UserCreatedTs;
                return  this;
            }
            public Builder DeactivatedTs( Timestamp UserDeactivatedTs ) {
                this.DeactivatedTs = UserDeactivatedTs;
                return  this;
            }

            public User build() {
                User user = new User( this );
                return user;
            }

        }

        public static class ID extends AbstractMsccEntityID {
            private String OrganizationID;
            private String UserID;

            public ID() {
            }

            public ID(String organizationID, String userID) {
                OrganizationID = organizationID;
                UserID = userID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        '}';
            }
        }

    }

    public final static class UserOffice extends AbstractMsccEntity {

        private ID ID;
        private String OfficeRole;
        private String OrganizationFacilitator;
        private String UserFacilitator;
        private Timestamp CreatedTs;
        private Timestamp DeactivatedTs;


        public UserOffice() {
        }

        private UserOffice( Builder builder ) {
            this.ID = builder.ID;
            this.OfficeRole = builder.OfficeRole;
            this.OrganizationFacilitator = builder.OrganizationFacilitator;
            this.UserFacilitator = builder.UserFacilitator;
            this.CreatedTs = builder.CreatedTs;
            this.DeactivatedTs = builder.DeactivatedTs;
        }

        public static Builder getBuilder() {
            return new Builder();
        }


        public UserOffice.ID getID() {
            return ID;
        }

        public void setID(UserOffice.ID ID) {
            this.ID = ID;
        }

        public String getOfficeRole() {
            return OfficeRole;
        }

        public void setOfficeRole(String officeRole) {
            OfficeRole = officeRole;
        }

        public String getOrganizationFacilitator() {
            return OrganizationFacilitator;
        }

        public void setOrganizationFacilitator(String organizationFacilitator) {
            OrganizationFacilitator = organizationFacilitator;
        }

        public String getUserFacilitator() {
            return UserFacilitator;
        }

        public void setUserFacilitator(String userFacilitator) {
            UserFacilitator = userFacilitator;
        }

        public Timestamp getCreatedTs() {
            return this.CreatedTs;
        }

        public void setCreatedTs(Timestamp userOfficeCreatedTs) {
            this.CreatedTs = userOfficeCreatedTs;
        }

        public Timestamp getDeactivatedTs() {
            return DeactivatedTs;
        }

        public void setDeactivatedTs(Timestamp DeactivatedTs) {
            this.DeactivatedTs = DeactivatedTs;
        }


        public static class Builder {
            private  ID ID;
            private String OfficeRole;
            private String OrganizationFacilitator;
            private String UserFacilitator;
            private Timestamp CreatedTs;
            private Timestamp DeactivatedTs;



            private Builder() {}

            public Builder ID( ID id ) {
                this.ID = id;
                return  this;

            }
            public Builder OfficeRole( String OfficeRole) {
                this.OfficeRole = OfficeRole;
                return  this;
            }
            public Builder OrganizationFacilitator( String OrganizationFacilitator) {
                this.OrganizationFacilitator = OrganizationFacilitator;
                return  this;
            }
            public Builder UserFacilitator( String UserFacilitator) {
                this.UserFacilitator = UserFacilitator;
                return  this;
            }
            public Builder CreatedTs( Timestamp CreatedTs ) {
                this.CreatedTs = CreatedTs;
                return  this;
            }
            public Builder DeactivatedTs( Timestamp DeactivatedTs ) {
                this.DeactivatedTs = DeactivatedTs;
                return  this;
            }

            public UserOffice build() {
                UserOffice userOffice = new UserOffice( this );
                return userOffice;
            }



        }


        public static class ID extends AbstractMsccEntityID {
            private String  OrganizationID;
            private String  OfficeID;
            private String  UserID;

            public ID() {
            }

            public ID(String organizationID, String officeID, String userID) {
                OrganizationID = organizationID;
                OfficeID = officeID;
                UserID = userID;
            }

            public String getOrganizationID() {
                return OrganizationID;
            }

            public void setOrganizationID(String organizationID) {
                OrganizationID = organizationID;
            }

            public String getOfficeID() {
                return OfficeID;
            }

            public void setOfficeID(String officeID) {
                OfficeID = officeID;
            }

            public String getUserID() {
                return UserID;
            }

            public void setUserID(String userID) {
                UserID = userID;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ID id = (ID) o;
                return Objects.equals(OrganizationID, id.OrganizationID) &&
                        Objects.equals(OfficeID, id.OfficeID) &&
                        Objects.equals(UserID, id.UserID);
            }

            @Override
            public int hashCode() {
                return Objects.hash(OrganizationID, OfficeID, UserID);
            }

            @Override
            public String toString() {
                return "ID{" +
                        "OrganizationID='" + OrganizationID + '\'' +
                        ", OfficeID='" + OfficeID + '\'' +
                        ", UserID='" + UserID + '\'' +
                        '}';
            }
        }


        public void update( MsccBean.UserOffice bean ) {
            Optional.of( bean ).ifPresent(
                    x ->  {
                        this.update( x.getOfficeRole() , x.getOrganizationFacilitator(), x.getUserFacilitator(),  x.getCreatedTs(),  x.getDeactivatedTs() );
                    } );
        }

        public void update( String officeRole, String organizationFacilitator, String userFacilitator, Timestamp CreatedTs, Timestamp DeactivatedTs ) {


            Optional.ofNullable( officeRole ).ifPresent(            (x) -> this.setOfficeRole( x ) );
            Optional.ofNullable( organizationFacilitator ).ifPresent(       (x) -> this.setOrganizationFacilitator( x ) );
            Optional.ofNullable( userFacilitator).ifPresent(            (x) -> this.setUserFacilitator( x ) );
            Optional.ofNullable( CreatedTs ).ifPresent(     (x) -> this.setCreatedTs( x ) );
            Optional.ofNullable( DeactivatedTs ).ifPresent( (x) -> this.setDeactivatedTs( x ) );

        }




        @Override
        public String toString() {
            return "UserOffice{" +
                    "ID=" + ID +
                    ", OfficeRole='" + OfficeRole + '\'' +
                    ", OrganizationFacilitator='" + OrganizationFacilitator + '\'' +
                    ", UserFacilitator='" + UserFacilitator + '\'' +
                    ", CreatedTs=" + CreatedTs +
                    ", DeactivatedTs=" + DeactivatedTs +
                    '}';
        }
    }


    public final static class Result {
        String result;

        public Result() {
        }

        public Result(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "result='" + result + '\'' +
                    '}';
        }
    }

}

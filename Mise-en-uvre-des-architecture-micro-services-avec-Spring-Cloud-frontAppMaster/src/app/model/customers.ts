declare module namespace {

  export interface Self {
    href: string;
  }

  export interface Customer2 {
    href: string;
    templated: boolean;
  }

  export interface Links {
    self: Self;
    customer: Customer2;
  }

  export interface Customer {
    name: string;
    email: string;
    _links: Links;
  }

  export interface Embedded {
    customers: Customer[];
  }

  export interface Self2 {
    href: string;
  }

  export interface Profile {
    href: string;
  }

  export interface Links2 {
    self: Self2;
    profile: Profile;
  }

  export interface Page {
    size: number;
    totalElements: number;
    totalPages: number;
    number: number;
  }

  export interface RootObject {
    _embedded: Embedded;
    _links: Links2;
    page: Page;
  }

}




  export interface Self {
    href: string;
  }

  export interface Product2 {
    href: string;
  }

  export interface Links {
    self: Self;
    product: Product2;
  }

  export interface Product {
    name: string;
    price: number;
    _links: Links;
  }

  export interface Embedded {
    products: Product[];
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


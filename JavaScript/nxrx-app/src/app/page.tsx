import Image from "next/image";
import Link from "next/link";
import ProductCard from "./components/ProductCard";

export default function Home() {
  return (<div>
      <Link href="/users">Users</Link>
      <Link href="/users/new">Users New</Link>
      <ProductCard/>
      </div>
  );
}

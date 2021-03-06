USE [quanlyktx2]
GO
ALTER TABLE [dbo].[SinhVien] DROP CONSTRAINT [FK__SinhVien__MaPhon__182C9B23]
GO
ALTER TABLE [dbo].[Setting] DROP CONSTRAINT [FK__Setting__TaiKhoa__117F9D94]
GO
ALTER TABLE [dbo].[NhoTaiKhoan] DROP CONSTRAINT [FK__NhoTaiKho__TaiKh__1367E606]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 28/04/2021 12:06:16 ******/
DROP TABLE [dbo].[TaiKhoan]
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 28/04/2021 12:06:16 ******/
DROP TABLE [dbo].[SinhVien]
GO
/****** Object:  Table [dbo].[Setting]    Script Date: 28/04/2021 12:06:16 ******/
DROP TABLE [dbo].[Setting]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 28/04/2021 12:06:16 ******/
DROP TABLE [dbo].[Phong]
GO
/****** Object:  Table [dbo].[NhoTaiKhoan]    Script Date: 28/04/2021 12:06:16 ******/
DROP TABLE [dbo].[NhoTaiKhoan]
GO
USE [master]
GO
/****** Object:  Database [quanlyktx2]    Script Date: 28/04/2021 12:06:16 ******/
DROP DATABASE [quanlyktx2]
GO
/****** Object:  Database [quanlyktx2]    Script Date: 28/04/2021 12:06:16 ******/
CREATE DATABASE [quanlyktx2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'quanlyktx2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\quanlyktx2.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'quanlyktx2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\quanlyktx2_log.ldf' , SIZE = 816KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [quanlyktx2] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [quanlyktx2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [quanlyktx2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [quanlyktx2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [quanlyktx2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [quanlyktx2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [quanlyktx2] SET ARITHABORT OFF 
GO
ALTER DATABASE [quanlyktx2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [quanlyktx2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [quanlyktx2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [quanlyktx2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [quanlyktx2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [quanlyktx2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [quanlyktx2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [quanlyktx2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [quanlyktx2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [quanlyktx2] SET  DISABLE_BROKER 
GO
ALTER DATABASE [quanlyktx2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [quanlyktx2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [quanlyktx2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [quanlyktx2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [quanlyktx2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [quanlyktx2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [quanlyktx2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [quanlyktx2] SET RECOVERY FULL 
GO
ALTER DATABASE [quanlyktx2] SET  MULTI_USER 
GO
ALTER DATABASE [quanlyktx2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [quanlyktx2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [quanlyktx2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [quanlyktx2] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [quanlyktx2] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'quanlyktx2', N'ON'
GO
USE [quanlyktx2]
GO
/****** Object:  Table [dbo].[NhoTaiKhoan]    Script Date: 28/04/2021 12:06:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhoTaiKhoan](
	[TaiKhoan] [varchar](50) NULL,
	[MatKhau] [varchar](50) NULL,
	[CheckNho] [bit] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 28/04/2021 12:06:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [int] NOT NULL,
	[TenPhong] [nvarchar](50) NOT NULL,
	[NgayThem] [date] NOT NULL,
	[GhiChu] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Setting]    Script Date: 28/04/2021 12:06:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Setting](
	[TaiKhoan] [varchar](50) NULL,
	[CheDo] [bit] NULL,
	[Nhac] [bit] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 28/04/2021 12:06:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SinhVien](
	[MaSinhVien] [varchar](50) NOT NULL,
	[TenSinhVien] [nvarchar](50) NOT NULL,
	[SDT] [varchar](15) NOT NULL,
	[DiaChi] [varchar](100) NOT NULL,
	[GioTinh] [bit] NOT NULL,
	[NgayDK] [date] NOT NULL,
	[NgayHetHan] [date] NOT NULL,
	[MaPhong] [int] NOT NULL,
	[NguoiThem] [varchar](50) NULL,
	[TienDong] [float] NULL,
	[DaDong] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSinhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 28/04/2021 12:06:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TaiKhoan] [varchar](50) NOT NULL,
	[MatKhau] [varchar](50) NOT NULL,
	[Email] [varchar](50) NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[VaiTro] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[TaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[NhoTaiKhoan]  WITH CHECK ADD FOREIGN KEY([TaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([TaiKhoan])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Setting]  WITH CHECK ADD FOREIGN KEY([TaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([TaiKhoan])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[SinhVien]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
USE [master]
GO
ALTER DATABASE [quanlyktx2] SET  READ_WRITE 
GO
